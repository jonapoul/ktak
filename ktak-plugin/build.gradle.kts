@file:Suppress("DSL_SCOPE_VIOLATION")

plugins {
  alias(libs.plugins.blueprint.kotlin.android)
  alias(libs.plugins.blueprint.android.library)
  alias(libs.plugins.blueprint.atak.library)
  alias(libs.plugins.blueprint.detekt)
  alias(libs.plugins.blueprint.ktlint)
  alias(libs.plugins.blueprint.licensee)
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
