# Changelog

All notable changes to this repository will be documented in this file.

> [!NOTE]
> Keep in mind that the commit SHA may changed each time I do a rebase, so the tagged release may not be accurate.

The format is a modified version of [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this repository don't fucking care for [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

- `Added` - for new features.
- `Changed ` - for changes in existing functionality.
- `Improved` - for enhancement or optimization in existing functionality.
- `Removed` - for currently removed features.
- `Fixed` - for any bug fixes.
- `Other` - for technical stuff.

## [Unreleased]

### Other
- Fuck u/spez part2

## [2.6.7] - 2026-10-31

### Added
- Add dependabot

### Fixed
- Navigation crash when clicking tags
- Avoid suspend call inside MutableStateFlow.update
- Cache storage permission checks and dedupe repeated permissions
- Cache resolved SAF document paths to avoid repeated storage lookups

### Other
- Release v2.6.7
- Update workflows
- Update docs

### Removed
- Remove alpha app flavour
- Remove suspend calls from state updates in HomeViewModel

## [2.6.6] - 2026-08-01

### Other
- Update v2.6.6
- Android tiles

## [2.6.5] - 2026-07-27

### Changed
- Use jdk 17
- Change whatsnew implementation to conventional method

### Other
- Release v2.6.5

## [2.6.4] - 2026-07-26

### Other
- Release v2.6.4
- Update docs
- Fuck u/spez

## [2.6.3] - 2026-07-25

### Added
- Add build test action

### Other
- V2.6.3

### Removed
- Remove unused telegram stuff

## [2.6.2] - 2026-05-15

### Added
- Add version name in release apk file names and also detect pre-releases
- Add ACRA (Crash reporting)
- Add AdaptiveBottomSheet
- Added translation using Weblate (Ukrainian)
- Add missing Light/Dark option in backup/restore dialog
- Add bottom padding to collections screen
- Add light dark feature info dialog
- Added translation using Weblate (Portuguese (Brazil))
- Added translation using Weblate (Japanese)
- Added translation using Weblate (Romanian)
- Added translation using Weblate (Polish)
- Added translation using Weblate (Turkish)
- Add test tags for some components
- Added translation using Weblate (Korean)
- Add viewed wallpapers feature, part of #29
- Add missing space
- Added translation using Weblate (Belarusian)
- Added translation using Weblate (Norwegian Bokmål)
- Add new function in FakeFavoriteDao
- Add favorite button to image viewer, closes #28
- Add spaces in saved search names in sources summary
- Add Traditional Chinese translation
- Add migration for auto_wallpaper_saved_search_id pref
- Add Reddit source
- Add migrations related to homeWallhavenSearch
- Add toQueryString and fromQueryString to WallhavenSearch
- Add toQueryString and fromQueryString to SearchMeta
- Add gradle run configs for tests
- Add initial UI for adding reddit
- Add initial network classes for Reddit api
- Add initial commit for benchmark module
- Add option to sort local wallpapers, closes #15
- Add broadcast details
- Added Russian translation
- Add setting to auto download wallpaper when applied via auto wallpaper changer, closes #8
- Add setting to mark wallpaper as favorite when used in automatic wallpaper, closes #7
- Add Local wallpapers feature
- Add AboutLibraries back with pre-generated json
- Add Compress Images workflow
- Add IzzyOnDroid link in README
- Add icons, metadata and screenshots for plus variant
- Add wallpaper target preference to auto wallpaper, closes #4
- Add CodeQL badge to README
- Add Favorites as an AutoWallpaper source
- Add changelogs
- Add Favorites
- Add max_line_length value in editorConfig
- Add 'Tagged Release' workflow for Github
- Add README
- Add LICENSE
- Add adaptive grid width preference
- Add cache and temp files cleanup worker
- Support multiple displays from Crop screen
- Add Theme preferences
- Add Layout preferences
- Add minimum resolution filter. See desc for more.
- Add Auto wallpaper feature
- Add Ratio filter, update dependencies
- Add search save feature
- Add two pane navigation

### Changed
- Make auto wallpaper pick sequential wallpapers instead of random
- Replace M2 PullToRefresh with M3 component
- Make subreddits input scrollable
- Set backoff criteria only if constraint does not require idle
- Revert "Replace custom nav logic with m3 adaptive nav scaffold"
- Replace custom nav logic with m3 adaptive nav scaffold
- Make MoreScreen scrollable
- Switch back to using LazyStaggeredGridState workaround
- Use the Chips provided by latest Material3 lib, as icon animation is fixed
- Change source visibility control to checkbox
- Use base class for Search
- Use json serialization for RedditSearch
- Use static string for test
- Make network rely on WallhavenSearch instead of WallhavenFilters
- Set separate app name for debug and plusDebug builds
- Set initial grid column minWidthPct to 40
- Change layout preferences section parameters scoped to each setting
- Set object detection disabled by default. Add a note regarding object detection crash.
- Replace backdrop with solid black color
- Replace Resolution with IntSize

### Fixed
- Fix local tab
- Fix crash when initial width is 0
- Fix 'No wallpaper found' when last local wallpaper reached
- Fix negative alpha causing crash
- Fix thumbnail not loaded before full image in tablet ui
- Fix pull to refresh in incorrect location in tablet ui
- Fix wierd gradient in wallpaper viewer in tablet ui
- Fix content padding in home
- Fix datastore scope in tests
- Fix deprecated getter usage
- Fix UI logic for 'Set to' dialog
- Fix auto wallpaper saved, local options not correctly updated in ui
- Fix source management dialog padding and click ux
- Fix formatting
- Fix multiple api requests fired
- Fix workflow failure
- Fix compilation of base app
- Fix model file name not actually saved in db
- Fix regression caused by updated dependencies
- Fix leak for Android Q
- Fix status bar icon color incorrect in some cases
- Fix ktlint errors
- Fix download error on Android 10, fixes #34
- Fix wallpapers not ordered according to api response, fixes #30
- Fix apply, download and share buttons not working for Reddit, fixes #26
- Fix abi version code for locally built apks
- Fix wallpaper viewer screen re-open on configuration change
- Fix restore failing when all wallhaven fav uploaders are null
- Fix auto wallpaper source dialog not saving modified saved searches
- Fix AutoWallpaperWorker for reddit source
- Fix imports in androidTests
- Fix import order
- Fix Foreign key violation, see desc
- Fix crash when trying to get uri's real path, fixes #17
- Fix auto wallpaper bugs related to saved search deletion
- Fixed and full translated ru-strings
- Fixed and full translated ru-strings
- Fix screenshots in README
- Fix backup/restore screen crash in tablet view
- Fix download not triggering storage permission dialog on lower API levels
- Fix README settings screenshot
- Fix folder paths in CodeQL workflow
- Fix formatting
- Fix CodeQL build action
- Fix search bar hidden when scrolling non-Home screens
- Fix search input not editable
- Fix top padding on wallpaper viewer panel in expanded mode
- Fix formatting
- Fix CleanupWorkerTest failing
- Fix top empty space in other screens
- Fix synthetic accessor warning
- Fix incorrect versionCode in github builds
- Fix screenshots in README
- Fix Serializable error while searching
- Fix Ratio filter behaviour
- Fix FAB padding
- Fix WallpaperCard recompositions occurring due to animateItemPlacement during scroll
- Fix pull to refresh not working on an empty grid
- Fix Errors component not correctly positioned
- Fix wallpaper actions not showing on reopening wallpaper
- Fix synthetic accessor warning
- Fix padding in crop screen
- Fix detection button stuck on loading when no objects detected
- Fix auto wallpaper incorrect crop result
- Fix lint warning about accessing drawable from context directly
- Fix set wallpaper bugs and missing ui. See desc.
- Fix FAB bottom padding on phones
- Fix incorrect material imports

### Improved
- Handle bad wallpapers in auto wallpaper
- Handle crash if Files app is disabled
- Handle some non-standard reddit json responses and filter out gifs
- Improve Wallpaper Grid performance
- Handle incomplete downloads
- Improve auto wallpaper "Change Now" ux

### Other
- Release v2.6.0-alpha01
- Prevent rare crash due to negative padding
- Upgrade dependencies. Update code for new pull to refresh api.
- Do not schedule auto wallpaper if disabled
- Reformat
- Update and fix colors
- Stop worker if auto wallpaper is disabled
- Hide TopBar when no wallpaper selected
- Re-organise More and Settings
- Reset zoom when selected wallpaper changes
- Move WallpaperScreen out of the bottom nav navgraph
- Migrate navigation-compose to 2.8.0-alpha07
- Move Search inside HomeScreen
- Rename MainGraph to MainNavGraph
- Move navigation transitions out of AppNavGraphs
- Move MainNavigation into navigation package
- Move AppNavGraphs out of ui.navigation and into navigation package
- Initial work for navigation test
- Migrate compose-destinations to v2
- Move search bar above navigation ui
- Upgrade dependencies
- Upgrade dependencies
- Release v2.5.0
- Merge pull request #84 from weblate/weblate-wallflow-translations
- Translated using Weblate (Turkish)
- Translated using Weblate (Ukrainian)
- Translated using Weblate (Belarusian)
- Translated using Weblate (Russian)
- Allow separate freq for home and lock screen auto wallpaper
- Merge pull request #83 from weblate/weblate-wallflow-translations
- Translated using Weblate (Romanian)
- Translated using Weblate (Belarusian)
- Release v2.4.3
- Update gradle plugin to 8.3.1
- Update jvmTarget and jvmToolchain to 17
- Upgrade M3 to 1.3.0-alpha02 and fix list item colors
- Merge pull request #79 from weblate/weblate-wallflow-translations
- Translated using Weblate (Turkish)
- Translated using Weblate (Russian)
- Translated using Weblate (Polish)
- Translated using Weblate (Russian)
- Translated using Weblate (Romanian)
- Translated using Weblate (Turkish)
- Release v2.4.2
- Fetch large 'WHERE..IN' queries in chunks. Read desc.
- Release v2.4.1
- Merge pull request #76 from weblate/weblate-wallflow-translations
- Translated using Weblate (Russian)
- Translated using Weblate (Romanian)
- Translated using Weblate (Belarusian)
- Translated using Weblate (Russian)
- Translated using Weblate (Turkish)
- Bring down info button
- Allow custom download folder
- Move MainSearch out of MainActivityContent
- Release 2.4.0
- Merge pull request #75 from weblate/weblate-wallflow-translations
- Translated using Weblate (Russian)
- Translated using Weblate (Turkish)
- Update baseline profiles
- Update about libraries JSON
- Delay auto wallpaper execution if device is rotated
- Merge branch 'RobBrazier-fix/download-model-no-filename' into develop
- Update tf lite model download logic
- Move ObjectDetectionModelEditDialog out of Dialogs.kt
- Merge branch 'fix/download-model-no-filename' of https://github.com/RobBrazier/WallFlow into RobBrazier-fix/download-model-no-filename
- Build filename from final model URL path if Content-Disposition not present
- Merge pull request #58 from weblate/weblate-wallflow-translations
- Translated using Weblate (Turkish)
- Translated using Weblate (Romanian)
- Translated using Weblate (Belarusian)
- Translated using Weblate (Turkish)
- Translated using Weblate (Polish)
- Translated using Weblate (Belarusian)
- Translated using Weblate (Russian)
- Translated using Weblate (Russian)
- Translated using Weblate (Japanese)
- Translated using Weblate (Belarusian)
- Translated using Weblate (Portuguese (Brazil))
- Translated using Weblate (Japanese)
- Translated using Weblate (Portuguese (Brazil))
- Upgrade kotlinx-datetime
- Upgrade dependencies
- Update auto wallpaper source management
- Update sources settings screen with light and dark option and allow separate sources for home and lock screen
- Move AutoWallpaperSourceOptionsDialog out of Dialogs.kt
- Update tests
- Update collections screen to show both favorites and light/dark wallpapers
- Move CollectionsScreenContent out of CollectionsScreen.kt
- Spotless changes
- Rename favorites screen and destination to collections
- Rename favorites screen package to collections
- Add ability to mark wallpapers as light or dark
- Update AGP
- Release 2.3.1
- Merge pull request #50 from weblate/weblate-wallflow-translations
- Translated using Weblate (Russian)
- Update resolution fetch logic for local images
- Create destination dir before creating file
- Release 2.3.0
- Update aboutlibraries.json
- Merge pull request #43 from weblate/weblate-wallflow-translations
- Translated using Weblate (Belarusian)
- Translated using Weblate (Russian)
- Translated using Weblate (Romanian)
- Translated using Weblate (Polish)
- Translated using Weblate (Polish)
- Translated using Weblate (Belarusian)
- Translated using Weblate (Turkish)
- Translated using Weblate (Belarusian)
- Translated using Weblate (Russian)
- Allow disabling crop to set scrolling wallpapers, resolves #42
- Check if object detector is enabled before starting detection
- Create destination file before copying, fixes #48
- Allow setting different wallpapers to home and lock screen, closes #39
- Move AutoWallpaperSetToDialog to separate file
- Merge branch 'migrate-chips-to-material3' into develop
- Merge branch 'wallflow-46-Can-not-add-r-MobileWallpaper-subreddit' into develop
- Allow uppercase chars in subreddit names, fixes #46
- Release 2.2.1
- Upgrade dependencies
- Release 2.2.0
- Merge pull request #41 from ammargitham/imgbot
- [ImgBot] Optimize images
- Merge pull request #40 from weblate/weblate-wallflow-translations
- Update translation files
- Merge pull request #38 from weblate/weblate-wallflow-translations
- Translated using Weblate (Belarusian)
- Translated using Weblate (Russian)
- Translated using Weblate (Korean)
- Update backup restore app prefs test
- Write tags to EXIF 'UserComment', part of #29
- Comment out unused composable
- Copy tag on long click, part of #29
- Update home sources when adding reddit source
- Show image url in info sheet and allow long click copy, part of #29
- Delete unused file
- Update dependencies and update deprecated usages
- Get image from cache if available when downloading or sharing
- Update FAB text depending on search state
- Remember prev search filters when searching, closes #31
- Allow setting app language from system settings
- Merge pull request #32 from weblate/weblate-wallflow-translations
- Translated using Weblate (Belarusian)
- Translated using Weblate (Russian)
- Translated using Weblate (Russian)
- Update translation files
- Translated using Weblate (Belarusian)
- Translated using Weblate (Norwegian Bokmål)
- Translated using Weblate (Russian)
- Separate uploader from wallhaven wallpaper to fix usage of rememberLazyStaggeredGridState
- Reformat, ignore HomeScreenTest
- Write some UI tests
- Upgrade dependencies
- Release v2.1.0
- Do not hide actions automatically on transform, fixes #27
- Upgrade AGP
- Update AboutLibraries json files
- Animate grid item position, temp solution for #25
- Merge branch 'develop'
- Allow auto wallpaper frequency in minutes, closes #24
- Update README.md with weblate info
- Merge pull request #23 from ammargitham/imgbot
- [ImgBot] Optimize images
- Release v2.0.0
- Show SubredditsInputField error only when dirty
- Migrate sealed class types in backups
- Allow file picker to choose json files in API 24
- Merge branch 'main' into develop
- Merge pull request #22 from abc0922001/patch-1
- Merge pull request #21 from ammargitham/wallflow-11-reddit-sub-as-source
- Cancel progress listener jobs once download completed or cancelled
- Re-enable tooltips as prev android bug is fixed
- Reformat
- Filter suggestions depending on active source
- Update baseline profiles
- Show initial sources loading
- Move home Composables
- Move dao interfaces to use sealed interface
- Move entity classes to use sealed interface
- Move search related files
- Rename search dao files
- Rename search related classes back to original, merge migrations
- Migrate WallhavenFilters to/From query string to json
- Directly save WallhavenSearch in preferences
- Directly use serialization for WallhavenSearch.toQueryString
- Extract datastore edits to function for reuse
- Extract preference mapping to functions
- Rename SearchMeta type to metaType to avoid conflict with kotlinx serialization
- Rename toSearchQuery to getQueryCombinedFilters
- Move WallhavenFiltersTest to search package
- Rename MockWallhavenNetworkApi to FakeWallhavenNetworkApi
- Reddit source
- Reformat
- Rename WallhavenSearchQuery to WallhavenFilters
- Move HomeScreen grid header render outside HomeScreenContent
- Rename wallhaven daos instance func calls
- Explicitly remove READ_PHONE_STATE permission added by Tensorflow
- Rename NetworkMetaQuerySerializer to NetworkWallhavenMetaQuerySerializer
- Rename util package to serializers
- Move wallhaven network classes to wallhaven package
- Rename NetworkResponse.kt to NetworkWallhavenResponse.kt
- Break NetworkResponse into separate wallhaven responses
- Read rate limit headers from wallhaven.cc responses
- Move wallhaven related db classes to wallhaven package
- Rename wallhaven daos
- Merge branch 'develop' into wallflow-11-reddit-sub-as-source
- Update README with Wallflow Plus links
- Update CodeQL gradle command to fix failing build in PR
- Merge pull request #19 from Atrafon/main
- Update Russian translation
- Rename SearchQueryEntity to WallhavenSearchQueryEntity
- Rename SearchQueryRemoteKeyEntity to WallhavenSearchQueryRemoteKeyEntity
- Rename SearchHistoryEntity to WallhavenSearchHistoryEntity
- Rename package automigrationspecs to automigrations
- Move manual migrations to separate package
- Rename db table saved_searches to wallhaven_saved_searches
- Rename SavedSearchEntity to WallhavenSavedSearchEntity
- Move search related models to search package
- Rename SavedSearch to WallhavenSavedSearch
- Rename Search to WallhavenSearch
- Move Wallhaven related SearchMeta to SearchMeta.kt
- Rename UploaderSearchMeta to WallhavenUploaderSearchMeta
- Rename TagSearchMeta to WallhavenTagSearchMeta
- Move SearchMeta outside Search.kt
- Move WallhavenSearchQuery to wallhaven package
- Move Order out of WallhavenSearchQuery.kt
- Move purity out of WallhavenSearchQuery.kt and make it source agnostic
- Rename wallhaven related classes
- Rename SearchQuery to WallhavenSearchQuery
- Move wallhaven repository files to wallhaven package
- Reformat
- Copy Accompanist Placeholder and remove dependency
- Rename StartupBenchmark class
- Reduce Home recompositions, add benchmarks
- Update edge-to-edge logic
- Benchmarks module now correctly generates baseline profiles
- Merge branch 'develop' into wallflow-11-reddit-sub-as-source
- Release v1.5.0
- Update README
- Reduce recompositions, improve scroll performance
- Move wallhaven daos to wallhaven package
- Rename wallhaven daos
- Move wallhaven entities to wallhaven package
- Rename wallhaven specific entities, add migration test
- Move AppDatabase to com.ammar.wallflow.data.db
- Capitalise const values
- Upgrade dependencies
- Release v1.4.0
- Update about libraries json
- Merge branch 'wallflow-10-Allow-quickly-setting-a-new-wallpaper' into develop
- Merge pull request #16 from Atrafon/main
- Update Russian translation
- Update Russian translation
- Merge branch 'wallflow-8-Auto-download-wallpaper-when-applied-via-auto-wallpaper-changer' into develop
- Prepare for Wallflow Plus F-Droid release
- Release v1.3.1
- Merge branch 'main' into develop
- Merge pull request #13 from ammargitham/imgbot
- [ImgBot] Optimize images
- Update README
- Update README screenshot
- Update README screenshot
- Merge branch 'develop' into release-v1.3.0
- Bump version in build.gradle and add changelog files
- Update About Libraries JSON files
- [Feature] Backup settings, favorites and saved searches, closes #5
- Upgrade dependencies
- Move wallhaven related models under 'wallhaven' package
- Rename objects related to Wallhaven
- Release v1.2.2
- Re-enable workflow cache as it was not causing reproducible builds to fail
- Allow Tagged Release to be triggered manually and disable cache
- Release v1.2.1
- Hide OpenSourceLicenses screen until reproducible builds with AboutLibraries is fixed
- Release v1.2.0
- Update MoreScreen expanded NavDrawer divider padding
- Update full_description
- Re-implement OSLibraries screen using M3 components
- Update to Kotlin 1.9.10
- Move settings to bottom nav screen
- Move all screen packages under common screens package
- Upgrade dependencies
- Release v1.1.0
- Do not run CodeQL for non-code changes
- Merge pull request #3 from ammargitham/imgbot
- [ImgBot] Optimize images
- Only build plusRelease for CodeQL
- Merge branch 'main' into develop
- Create codeql workflow
- Update README and metadata
- Auto migrate from 2 to 3
- Comment unused dependencies
- Separate home and main search to fix home query showing in search bar
- Merge branch 'develop' into migrate-to-accompanist-two-pane
- Release v1.0.1
- Room generated schema files
- Update dependencies
- Migrate to Accompanist TwoPane
- Fallback to full image for thumbnail if thumbs throw 404
- Enable spotless with ktlint
- Scroll SearchBar on scrolling feed
- Update Room to 2.6.0-alpha02
- Merge branch 'develop' into upgrade-to-kotlin-19
- F-Droid prep
- Update AGP to 8.2.0-alpha15
- Update targetSDK to 34, kotlin to 1.9.0, and other dependencies.
- Hide query in search bar for Home search
- Upgrade AGP
- Extract missed string resources
- Show NSFW filter only if wallhaven key is provided
- Separate out Object Detection feature into "Plus" flavor to reduce base apk size
- Prepare for release
- Update icons
- Adapt Layout preview height to screen height
- Update Layout "No. of Columns" section UI
- Workaround for keyboard popping up for readOnly TextField
- Move Layout settings "Rounded Corners" section to Composables.kt and add preview
- Move Layout settings "No. of Columns" section to Composables.kt and add preview
- Move Layout settings Grid Type section to Composables.kt and add preview
- Optimise imports
- Log fetch errors
- Increase wallpaper actions bg transparency
- Hide bottom navigation until Favourites is added
- Migrate to telephoto
- Update dependencies
- Rename app to WallFlow
- Allow receiving image from any app to set as wallpaper
- Extract string resources
- MediaScan images after downloading
- Limit Constraint type IDLE to SDK M and above
- Merge pull request #1 from ammargitham/task/auto-wallpaper
- Move EditSearchContent composables to Composables.kt
- Rename WallpaperFilters to EditSearchModalBottomSheet
- Rename wallpaperfilters package to searchedit
- Two panes in HomeScreen (WIP). Convert search to docked for Expanded screens.
- Hoist MainSearchBar state to MainActivity, also migrate to collectAsStateWithLifecycle
- Initial commit

### Removed
- Remove local uri from auto wallpaper history and favs when access is revoked
- Remove transition delay for better predictive back feedback
- Remove reliance on response for model file name when downloading
- Remove tag click current search equal check in WallpaperScreen
- Remove debug log
- Remove unused strings
- Remove extra space from string
- Remove filter icon from active search bar
- Remove order from wallpaper selection to fix build warning from Room
- Remove some unused strings
- Remove unused file
- Remove backwards compat code for WallhavenSearch
- Remove staging buildType for tests as it was causing some build issues
- Remove to/from QueryString from SearchMeta, and use serialization directly
- Remove WallhavenFilters.getQString
- Remove unused adapter factory
- Drop API 23 support and add 3 ways to quick change wallpaper, see desc
- Remove Tooltip, causes crash when activity goes into background, fixes #12
- Remove static VERSION_CODE as it is possibly causing reproducible builds to fail
- Remove Anti-Feature explanation
- Remove fallbackToDestructiveMigration for debug builds
- Remove unneeded schema files generated by Room 2.6.0-alpha02
- Remove unnecessary Suppress annotations
- Remove use of `key` to recompose AlertDialog.
- Remove commented code
- Remove duplicate strings for some cases
- Remove unused code
- Remove obsolete SDK version check
- Remove obsolete @OptIn annotation
- Remove androidx.window dependency, lower sdk target to 33, and downgrade compose.material3 to 1.2.0-alpha02 due to incompatibility with AGP plugin.
- Remove useless log
- Remove SearchScreen

[unreleased]: https://github.com/ddCeka/wallflow/compare/v2.6.7...HEAD
[2.6.7]: https://github.com/ddCeka/wallflow/compare/v2.6.6...v2.6.7
[2.6.6]: https://github.com/ddCeka/wallflow/compare/v2.6.5...v2.6.6
[2.6.5]: https://github.com/ddCeka/wallflow/compare/v2.6.4...v2.6.5
[2.6.4]: https://github.com/ddCeka/wallflow/compare/v2.6.3...v2.6.4
[2.6.3]: https://github.com/ddCeka/wallflow/compare/v2.6.2...v2.6.3
[2.6.2]: https://github.com/ddCeka/wallflow/compare/v2.6.1...v2.6.2


