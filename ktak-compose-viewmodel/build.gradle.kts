plugins {
  kotlin("android")
  id("convention-android")
  id("convention-kotlin")
  id("convention-compose")
  id("convention-publish")
  id("convention-style")
}

android {
  namespace = "ktak.compose.viewmodel"
}

dependencies {
  api(libs.androidx.compose.runtime)
  api(libs.androidx.lifecycle.viewmodel)

  implementation(libs.androidx.lifecycle.viewmodelCompose)

  debugRuntimeOnly(libs.androidx.compose.ui.tooling)
}
