@file:Suppress("DSL_SCOPE_VIOLATION")

plugins {
  alias(libs.plugins.blueprint.android.library)
  alias(libs.plugins.blueprint.android.compose)
  alias(libs.plugins.blueprint.atak.library)
  alias(libs.plugins.blueprint.detekt)
  alias(libs.plugins.blueprint.ktlint)
  alias(libs.plugins.blueprint.licensee)
  alias(libs.plugins.blueprint.publish)
  alias(libs.plugins.blueprint.spotless)
  alias(libs.plugins.blueprint.dependencyGuard)
}

android {
  namespace = "ktak.compose.navigation"
}

dependencies {
  api(projects.ktakComposeCore)
  api(projects.ktakCore)
  api(libs.androidx.compose.runtime)

  implementation(libs.timber)

  debugRuntimeOnly(libs.androidx.compose.ui.tooling)
}
