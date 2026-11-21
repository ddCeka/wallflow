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
        Log.d("RedditAuthDebug", "Response: ${response.code} ${response.message} | url = ${request.url} | body = [$bodyPreview]")
        checkForErrors(response)
        return response
    }

    private suspend fun appendCookie(request: Request): Request {
        val redditCookie = appPreferencesRepository.getRedditCookie()
        val targetUrl = if (request.url.host == "reddit.com") {
            request.url.newBuilder()
                .host("www.reddit.com")
                .build()
        } else {
            request.url
        }
        val builder = request.newBuilder()
            .url(targetUrl)
            .header(
                "User-Agent",
                "Mozilla/5.0 (Linux; Android 14; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/130.0.0.0 Mobile Safari/537.36",
            )
            .header("Accept", "application/json")
            .header("Accept-Language", "en-US,en;q=0.9")
            .header("Sec-Fetch-Dest", "empty")
            .header("Sec-Fetch-Mode", "cors")
            .header("Sec-Fetch-Site", "same-origin")
        Log.d("RedditAuthDebug", "Request: ${request.url} | stored cookie = [$redditCookie]")
        if (redditCookie.isNotBlank()) {
            builder.removeHeader("Cookie")
                .header("Cookie", redditCookie)
        }
        val builtRequest = builder.build()
        Log.d(
            "RedditAuthDebug",
            "Outgoing headers | User-Agent = [${builtRequest.header("User-Agent")}] | Cookie = [${builtRequest.header("Cookie")}]",
        )
        return builtRequest
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
