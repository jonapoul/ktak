@file:Suppress("DSL_SCOPE_VIOLATION")

plugins {
  id("convention-android-lib")
  id("convention-android-res")
  id("convention-kotlin")
  id("convention-android-compose")
  id("convention-publish")
  id("convention-style")
  id("convention-dependency-guard")
}

android {
  namespace = "ktak.compose.preview"
}

dependencies {
  api(libs.androidx.compose.runtime)
  api(libs.androidx.compose.ui.core)

  implementation(projects.ktakCore)
  implementation(projects.ktakComposeCore)
  implementation(libs.androidx.compose.foundation.core)
  implementation(libs.androidx.compose.foundation.layout)
  implementation(libs.androidx.compose.material.core)
  implementation(libs.androidx.compose.ui.graphics)
  implementation(libs.androidx.compose.ui.unit)

  debugRuntimeOnly(libs.androidx.compose.ui.tooling)
}
