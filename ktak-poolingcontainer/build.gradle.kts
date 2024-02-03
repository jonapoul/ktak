@file:Suppress("UnstableApiUsage")

plugins {
  kotlin("android")
  id("convention-android")
  id("convention-kotlin")
  id("convention-publish")
  id("convention-style")
}

android {
  namespace = "dev.jonpoulton.ktak.poolingcontainer"

  buildFeatures {
    resValues = true
    androidResources = true
  }
}

dependencies {
  implementation(libs.androidx.annotation)
}
