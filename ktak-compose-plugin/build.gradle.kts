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
  namespace = "ktak.compose.plugin"
}

dependencies {
  api(projects.ktakCore)
  api(projects.ktakComposeCore)
  api(projects.ktakPlugin)
  api(libs.androidx.compose.ui.core)
  api(libs.androidx.compose.material.core)

  debugApi(libs.androidx.compose.runtime)
  releaseImplementation(libs.androidx.compose.runtime)

  implementation(projects.ktakComposeViewmodel)
  implementation(libs.androidx.lifecycle.viewmodelCompose)
}
