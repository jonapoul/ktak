@file:Suppress("DSL_SCOPE_VIOLATION")

plugins {
  id("convention-android-lib")
  id("convention-kotlin")
  alias(libs.plugins.blueprint.android.resources)
  id("convention-atak")
  id("convention-detekt")
  id("convention-ktlint")
  id("convention-licensee")
  id("convention-publish")
  id("convention-spotless")
  alias(libs.plugins.blueprint.dependencyGuard)
}

android {
  namespace = "ktak.ui"
}

dependencies {
  api(projects.ktakCore)
  implementation(libs.kotlinx.coroutines.core)
  implementation(libs.timber)
}
