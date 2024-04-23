buildscript {
    repositories {
        gradlePluginPortal()
        maven {
            url = uri("https://storage.googleapis.com/r8-releases/raw")
        }
    }
    dependencies {
        classpath("com.android.tools:r8:8.2.26") //FIX com.android.tools.r8.internal.nc: Sealed classes are not supported as program classes( Java 17 导致的问题)
    }
}

@Suppress("DSL_SCOPE_VIOLATION") //fix libs error
plugins {
    id(libs.plugins.android.application.get().pluginId) apply false
    id(libs.plugins.android.library.get().pluginId) apply false
    id(libs.plugins.android.test.get().pluginId) apply false
    id(libs.plugins.kotlin.android.get().pluginId) apply false
    id(libs.plugins.spotless.get().pluginId) version (libs.versions.spotless)
    id(libs.plugins.android.benchmark.get().pluginId) version (libs.versions.benchmark) apply false
    id("maven-publish")
    id("io.gitlab.arturbosch.detekt") version "1.23.3"
}
