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
  namespace = "dev.jonpoulton.ktak.compose.core"
}

dependencies {
  api(projects.ktakCore)
  implementation(projects.ktakRes)
  implementation(libs.androidx.compose.ui.fonts)
}
