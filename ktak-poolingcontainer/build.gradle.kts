@file:Suppress("DSL_SCOPE_VIOLATION")

plugins {
  alias(libs.plugins.blueprint.kotlin.android)
  alias(libs.plugins.blueprint.android.library)
  alias(libs.plugins.blueprint.android.resources)
  id("convention-detekt")
  alias(libs.plugins.blueprint.ktlint)
  id("convention-licensee")
  id("convention-publish")
  id("convention-spotless")
  alias(libs.plugins.blueprint.dependencyGuard)
}

android {
  namespace = "ktak.poolingcontainer"
}

dependencies {
  compileOnly(libs.androidx.annotation)
}
