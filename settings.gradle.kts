enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)

    repositories {
        google()
        mavenCentral()
        maven { setUrl("https://jitpack.io") }
    }
}

pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

rootProject.name = "Soundify"
include(":app")
include(":innertube")
include(":kugou")
include(":lrclib")
include(":kizzy")
include(":material-color-utilities")

// Use a local copy of NewPipe Extractor by uncommenting the lines below.
// We assume that Soundify and NewPipe Extractor have the same parent directory.
// If this is not the case, please change the path in includeBuild().
//
// For this to work, you also need to change the implementation in innertube/build.gradle.kts
// to one which does not specify a version.
// From:
//      implementation(libs.newpipe.extractor)
// To:
//      implementation("com.github.teamnewpipe:NewPipeExtractor")
// includeBuild("../NewPipeExtractor") {
//     dependencySubstitution {
//         substitute(module("com.github.teamnewpipe:NewPipeExtractor")).using(project(":extractor"))
//     }
// }