@file:Suppress("DSL_SCOPE_VIOLATION")

plugins {
  alias(libs.plugins.blueprint.kotlin.android)
  alias(libs.plugins.blueprint.android.library)
  alias(libs.plugins.blueprint.android.resources)
  alias(libs.plugins.blueprint.atak.library)
  alias(libs.plugins.blueprint.detekt)
  alias(libs.plugins.blueprint.ktlint)
  alias(libs.plugins.blueprint.licensee)
  alias(libs.plugins.blueprint.kover)
  alias(libs.plugins.blueprint.publish)
  alias(libs.plugins.blueprint.spotless)
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
