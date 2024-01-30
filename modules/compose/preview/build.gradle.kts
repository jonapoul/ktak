@file:Suppress("UnstableApiUsage")

plugins {
  kotlin("android")
  id("convention-android")
  id("convention-kotlin")
  id("convention-compose")
  id("convention-publish")
  id("convention-style")
}

android {
  namespace = "dev.jonpoulton.ktak.compose.preview"

  buildFeatures {
    androidResources = true
    resValues = true
  }
}

dependencies {
  implementation(projects.modules.compose.core)
}
