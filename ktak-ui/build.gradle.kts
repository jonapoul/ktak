@file:Suppress("UnstableApiUsage")

plugins {
  kotlin("android")
  id("convention-android")
  id("convention-kotlin")
  id("convention-atak")
  id("convention-publish")
  id("convention-style")
  id("convention-test")
}

android {
  namespace = "ktak.ui"

  buildFeatures {
    resValues = true
  }
}

dependencies {
  api(projects.ktakCore)
  implementation(libs.timber)
}
