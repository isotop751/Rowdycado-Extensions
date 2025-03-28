
@file:Suppress("UnstableApiUsage")

import org.jetbrains.kotlin.konan.properties.Properties

// use an integer for version numbers
version = 11

android {
    buildFeatures {
        buildConfig = true
    }

    defaultConfig {
        val properties = Properties()
        properties.load(project.rootProject.file("local.properties").inputStream())

        buildConfigField("String", "TMDB_API", "\"${properties.getProperty("TMDB_API")}\"")
        buildConfigField("String", "GHOSTX_API", "\"${properties.getProperty("GHOSTX_API")}\"")
        buildConfigField("String", "CINEMATV_API", "\"${properties.getProperty("CINEMATV_API")}\"")
        buildConfigField("String", "SFMOVIES_API", "\"${properties.getProperty("SFMOVIES_API")}\"")
        buildConfigField("String", "ZSHOW_API", "\"${properties.getProperty("ZSHOW_API")}\"")
        buildConfigField("String", "DUMP_API", "\"${properties.getProperty("DUMP_API")}\"")
        buildConfigField("String", "DUMP_KEY", "\"${properties.getProperty("DUMP_KEY")}\"")
        buildConfigField("String", "CRUNCHYROLL_BASIC_TOKEN", "\"${properties.getProperty("CRUNCHYROLL_BASIC_TOKEN")}\"")
        buildConfigField("String", "CRUNCHYROLL_REFRESH_TOKEN", "\"${properties.getProperty("CRUNCHYROLL_REFRESH_TOKEN")}\"")
        buildConfigField("String", "MOVIE_API", "\"${properties.getProperty("MOVIE_API")}\"")
        buildConfigField("String", "MultiMovies_API", "\"${properties.getProperty("MultiMovies_API")}\"")
        buildConfigField("String", "MovieDrive_API", "\"${properties.getProperty("MovieDrive_API")}\"")
        buildConfigField("String", "AsianDrama_API", "\"${properties.getProperty("AsianDrama_API")}\"")
    }
}

cloudstream {
    language = "en"
    // All of these properties are optional, you can safely remove them

    description = "#1 best extention based on MultiAPI"
    authors = listOf("KillerDogeEmpire, Phisher98, Hexated, Sora")

    /**
     * Status int as the following:
     * 0: Down
     * 1: Ok
     * 2: Slow
     * 3: Beta only
     * */
    status = 1 // will be 3 if unspecified
    tvTypes = listOf(
        "AsianDrama",
        "TvSeries",
        "Anime",
        "Movie",
    )

    iconUrl = "https://www.google.com/s2/favicons?domain=uncutmaza.cc&sz=%size%"

    isCrossPlatform = false
}

dependencies {
    // FIXME remove this when crossplatform is fully supported (only SubtitleHelper)
    val cloudstream by configurations
    cloudstream("com.lagradost:cloudstream3:pre-release")
}
