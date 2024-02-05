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
  api(projects.ktakComposeCore)
  api(libs.androidx.lifecycle.viewmodelCompose)
}
