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
  namespace = "ktak.compose.icons"

  buildFeatures {
    resValues = true
    androidResources = true
  }
}

dependencies {
  api(libs.androidx.compose.runtime)
  api(libs.androidx.compose.ui.core)

  implementation(projects.ktakComposeCore)
  implementation(libs.androidx.compose.foundation.core)
  implementation(libs.androidx.compose.foundation.layout)
  implementation(libs.androidx.compose.material.core)
  implementation(libs.androidx.compose.ui.geometry)
  implementation(libs.androidx.compose.ui.graphics)
  implementation(libs.androidx.compose.ui.text)
  implementation(libs.androidx.compose.ui.unit)

  debugRuntimeOnly(libs.androidx.compose.ui.tooling)
  compileOnly(projects.ktakComposePreview)
}
