@file:Suppress("DSL_SCOPE_VIOLATION")

plugins {
  alias(libs.plugins.blueprint.kotlin.android)
  alias(libs.plugins.blueprint.android.library)
  id("convention-atak")
  id("convention-detekt")
  id("convention-ktlint")
  id("convention-licensee")
  id("convention-publish")
  id("convention-spotless")
  alias(libs.plugins.blueprint.dependencyGuard)
}

android {
  namespace = "ktak.plugin"
}

dependencies {
  api(projects.ktakCore)
  api(libs.timber)
}
