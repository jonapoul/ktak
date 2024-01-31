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
  api(projects.ktakComposeCore)
  api(projects.ktakComposeComponents)
  api(projects.ktakComposeViewmodel)
  api(projects.ktakPlugin)
  api(libs.androidx.lifecycle.viewmodelCompose)
}
