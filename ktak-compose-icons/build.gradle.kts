@file:Suppress("UnstableApiUsage", "DSL_SCOPE_VIOLATION")

plugins {
  kotlin("android")
  id("convention-android")
  id("convention-kotlin")
  id("convention-compose")
  id("convention-publish")
  id("convention-style")
}

android {
  namespace = "ktak.compose.icons"

  buildFeatures {
    resValues = true
    androidResources = true
  }
}

dependencies {
  api(projects.ktakComposeCore)
  compileOnly(projects.ktakComposePreview)
}
