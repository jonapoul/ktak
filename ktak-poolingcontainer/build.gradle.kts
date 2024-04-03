@file:Suppress("DSL_SCOPE_VIOLATION")

plugins {
  alias(libs.plugins.blueprint.kotlin.android)
  alias(libs.plugins.blueprint.android.library)
  alias(libs.plugins.blueprint.android.resources)
  alias(libs.plugins.blueprint.detekt)
  alias(libs.plugins.blueprint.ktlint)
  alias(libs.plugins.blueprint.licensee)
  id("convention-publish")
  alias(libs.plugins.blueprint.spotless)
  alias(libs.plugins.blueprint.dependencyGuard)
}

android {
  namespace = "ktak.poolingcontainer"
}

dependencies {
  compileOnly(libs.androidx.annotation)
}
