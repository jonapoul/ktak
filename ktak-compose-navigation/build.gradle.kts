plugins {
  kotlin("android")
  id("convention-android")
  id("convention-atak")
  id("convention-kotlin")
  id("convention-compose")
  id("convention-publish")
  id("convention-style")
}

android {
  namespace = "ktak.compose.navigation"
}

dependencies {
  api(projects.ktakComposeCore)
  api(projects.ktakCore)
  api(libs.androidx.compose.runtime)

  implementation(libs.androidx.compose.ui.core)
  implementation(libs.timber)

  debugRuntimeOnly(libs.androidx.compose.ui.tooling)
}
