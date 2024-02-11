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
  namespace = "ktak.compose.core"
}

dependencies {
  api(projects.ktakCore)
  api(projects.ktakLifecycle)
  api(projects.ktakPlugin)
  api(libs.androidx.compose.runtime)
  api(libs.androidx.compose.ui.core)
  api(libs.androidx.compose.ui.text)
  api(libs.androidx.compose.material.core)
  api(libs.androidx.lifecycle.common)

  implementation(projects.ktakComposeViewmodel)
  implementation(projects.ktakRes)
  implementation(libs.androidx.annotation)
  implementation(libs.androidx.compose.ui.graphics)
  implementation(libs.androidx.compose.ui.unit)
  implementation(libs.androidx.compose.foundation.core)
  implementation(libs.androidx.lifecycle.viewmodelCompose)
  implementation(libs.timber)

  debugRuntimeOnly(libs.androidx.compose.ui.tooling)
}
