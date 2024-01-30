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

include(":modules:compose:components")
include(":modules:compose:core")
include(":modules:compose:icons")
include(":modules:compose:plugin")
include(":modules:compose:preview")
include(":modules:compose:viewmodel")
include(":modules:core")
include(":modules:dagger")
include(":modules:plugin")
include(":modules:res")
include(":modules:ui")

// https://docs.gradle.org/current/userguide/declaring_dependencies.html#sec:type-safe-project-accessors
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

// https://docs.gradle.org/current/userguide/configuration_cache.html#config_cache:stable
enableFeaturePreview("STABLE_CONFIGURATION_CACHE")
