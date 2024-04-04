@file:Suppress("DSL_SCOPE_VIOLATION")

plugins {
  id("convention-android-lib")
  id("convention-kotlin")
  id("convention-android-compose")
  id("convention-atak")
  id("convention-detekt")
  id("convention-ktlint")
  id("convention-licensee")
  id("convention-publish")
  id("convention-spotless")
  id("convention-dependency-guard")
}

android {
  namespace = "ktak.compose.navigation"
}

dependencies {
  api(projects.ktakComposeCore)
  api(projects.ktakCore)
  api(libs.androidx.compose.runtime)

  implementation(libs.timber)

  debugRuntimeOnly(libs.androidx.compose.ui.tooling)
}
