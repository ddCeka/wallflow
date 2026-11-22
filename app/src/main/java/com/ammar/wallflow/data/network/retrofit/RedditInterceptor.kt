package com.ammar.wallflow.data.network.retrofit

import android.util.Log
import com.ammar.wallflow.data.repository.AppPreferencesRepository
import com.ammar.wallflow.data.repository.GlobalErrorsRepository
import com.ammar.wallflow.data.repository.GlobalErrorsRepository.GlobalErrorType
import com.ammar.wallflow.data.repository.GlobalErrorsRepository.RedditUnauthorisedError
import javax.inject.Inject
import javax.inject.Singleton
import kotlinx.coroutines.runBlocking
import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response

@Singleton
class RedditInterceptor @Inject constructor(
    private val appPreferencesRepository: AppPreferencesRepository,
    private val globalErrorsRepository: GlobalErrorsRepository,
) : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
        if (!request.url.host.endsWith("reddit.com")) {
            return chain.proceed(request)
        }
        val newRequest = runBlocking { appendCookie(request) }
        val response = chain.proceed(newRequest)
        val bodyPreview = if (!response.isSuccessful) {
            runCatching { response.peekBody(512).string() }.getOrDefault("unreadable")
        } else {
            "OK"
        }
        Log.d("RedditAuthDebug", "Response: ${response.code} ${response.message} | url = ${newRequest.url} | body = [$bodyPreview]")
        checkForErrors(response)
        return response
    }

    private suspend fun appendCookie(request: Request): Request {
        val redditCookie = appPreferencesRepository.getRedditCookie()
        val tokenV2 = extractCookieValue(redditCookie, "token_v2")
        val targetUrlBuilder = request.url.newBuilder()
        if (
            request.url.host == "reddit.com" ||
            request.url.host == "www.reddit.com" ||
            request.url.host == "old.reddit.com"
        ) {
            targetUrlBuilder.host("oauth.reddit.com")
        }
        if (request.url.encodedPath.endsWith(".json") && request.url.queryParameter("raw_json") == null) {
            targetUrlBuilder.addQueryParameter("raw_json", "1")
        }
        val targetUrl = targetUrlBuilder.build()
        val builder = request.newBuilder()
            .url(targetUrl)
            .header("User-Agent", "android:com.ammar.wallflow:v1.0 (by /u/ddCeka)")
            .header("Accept", "application/json")
            .removeHeader("Cookie")
        if (!tokenV2.isNullOrBlank()) {
            builder.header("Authorization", "Bearer $tokenV2")
        }
        val builtRequest = builder.build()
        Log.d(
            "RedditAuthDebug",
            "Request: $targetUrl | token_v2 present = [${!tokenV2.isNullOrBlank()}] | User-Agent = [${builtRequest.header("User-Agent")}]",
        )
        return builtRequest
    }

    private fun extractCookieValue(cookieHeader: String, name: String): String? {
        if (cookieHeader.isBlank()) return null
        return cookieHeader.split(";")
            .map { it.trim() }
            .firstOrNull { it.startsWith("$name=") }
            ?.substringAfter("=")
            ?.trim()
            ?.takeIf { it.isNotEmpty() }
    }

    private fun checkForErrors(response: Response) {
        if (!response.isSuccessful) {
            when (response.code) {
                401, 403 -> globalErrorsRepository.addError(
                    RedditUnauthorisedError(),
                    replace = true,
                )
            }
        } else {
            globalErrorsRepository.removeErrorByType(
                GlobalErrorType.REDDIT_UNAUTHORISED,
            )
        }
    }
}
