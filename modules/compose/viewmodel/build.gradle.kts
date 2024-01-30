plugins {
  kotlin("android")
  id("convention-android")
  id("convention-kotlin")
  id("convention-compose")
  id("convention-publish")
  id("convention-style")
}

android {
  namespace = "dev.jonpoulton.ktak.compose.viewmodel"
}

dependencies {
  api(projects.modules.compose.core)
  api(libs.androidx.lifecycle.viewmodelCompose)
}
