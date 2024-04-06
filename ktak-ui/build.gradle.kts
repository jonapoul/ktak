@file:Suppress("DSL_SCOPE_VIOLATION")

plugins {
  id("convention-android-lib")
  id("convention-android-res")
  id("convention-kotlin")
  id("convention-atak")
  id("convention-publish")
  id("convention-style")
  id("convention-dependency-guard")
}

android {
  namespace = "ktak.ui"
}

dependencies {
  api(projects.ktakCore)
  implementation(libs.kotlinx.coroutines.core)
  implementation(libs.timber)
}
