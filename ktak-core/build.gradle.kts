@file:Suppress("DSL_SCOPE_VIOLATION")

plugins {
  alias(libs.plugins.blueprint.kotlin.android)
  alias(libs.plugins.blueprint.android.library)
  alias(libs.plugins.blueprint.atak.library)
  id("convention-detekt")
  alias(libs.plugins.blueprint.kover)
  id("convention-ktlint")
  id("convention-licensee")
  id("convention-publish")
  id("convention-spotless")
  alias(libs.plugins.blueprint.dependencyGuard)
}

android {
  namespace = "ktak.core"
}
