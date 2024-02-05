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
  namespace = "dev.jonpoulton.ktak.compose.components"
}

dependencies {
  api(projects.ktakComposeCore)
  implementation(libs.androidx.compose.material.icons)
  implementation(libs.androidx.compose.ui.util)
  implementation(libs.kotlinx.immutable)

  // only used for previews
  compileOnly(projects.ktakComposeIcons)
  compileOnly(projects.ktakComposePreview)
}
