pluginManagement {
    repositories {
        gradlePluginPortal()
        google{
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        maven("https://jitpack.io")
    }
}
dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        mavenLocal()
        maven("https://jitpack.io")
    }
}
rootProject.name = "FlycoTabLayout"
include(":app")
include(":FlycoTabLayout_Lib")
