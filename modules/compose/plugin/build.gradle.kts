@file:Suppress("DSL_SCOPE_VIOLATION")

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
  namespace = "dev.jonpoulton.ktak.compose.plugin"
}

dependencies {
  api(projects.modules.compose.core)
  api(projects.modules.compose.components)
  api(projects.modules.compose.viewmodel)
  api(projects.modules.plugin)
  api(libs.androidx.lifecycle.viewmodelCompose)
}
