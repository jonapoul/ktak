@file:Suppress("UnstableApiUsage")

import ktak.gradle.intProperty
import ktak.gradle.stringProperty

plugins {
  id("com.android.library")
  id("org.gradle.android.cache-fix")
}

val javaVersion = stringProperty(key = "javaVersion")

android {
  compileSdk = intProperty(key = "android.compileSdk")

  defaultConfig {
    minSdk = intProperty(key = "android.minSdk")
    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    testInstrumentationRunnerArguments["disableAnalytics"] = "true"
  }

  compileOptions {
    sourceCompatibility = JavaVersion.toVersion(javaVersion)
    targetCompatibility = JavaVersion.toVersion(javaVersion)
  }

  buildFeatures {
    aidl = false
    buildConfig = false
    dataBinding = false
    mlModelBinding = false
    prefab = false
    prefabPublishing = false
    renderScript = false
    shaders = false

    // enabled as needed
    androidResources = false
    compose = false
    resValues = false
    viewBinding = false
  }

  lint {
    checkReleaseBuilds = false
    abortOnError = false
    quiet = true
    lintConfig = rootProject.file("lint.xml")
  }

  testOptions {
    unitTests {
      isIncludeAndroidResources = true
      isReturnDefaultValues = true
      all { test -> test.jvmArgs("-noverify") }
    }
  }
}
