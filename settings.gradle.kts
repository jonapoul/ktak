@file:Suppress("UnstableApiUsage")

rootProject.name = "ktak"

pluginManagement {
  repositories {
    gradlePluginPortal()
    mavenCentral()
    google()
  }
}

dependencyResolutionManagement {
  repositories {
    mavenCentral()
    google()
    maven { url = uri("https://jitpack.io") }
    mavenLocal()
  }
}

includeBuild("build-logic")

include(":ktak-compose-components")
include(":ktak-compose-core")
include(":ktak-compose-icons")
include(":ktak-compose-plugin")
include(":ktak-compose-preview")
include(":ktak-compose-viewmodel")
include(":ktak-core")
include(":ktak-dagger")
include(":ktak-lifecycle")
include(":ktak-plugin")
include(":ktak-poolingcontainer")
include(":ktak-res")
include(":ktak-ui")

// https://docs.gradle.org/current/userguide/declaring_dependencies.html#sec:type-safe-project-accessors
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

// https://docs.gradle.org/current/userguide/configuration_cache.html#config_cache:stable
enableFeaturePreview("STABLE_CONFIGURATION_CACHE")
