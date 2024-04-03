@file:Suppress("DSL_SCOPE_VIOLATION")

plugins {
  alias(libs.plugins.blueprint.android.resources)
  id("convention-publish")
  alias(libs.plugins.blueprint.licensee)
  alias(libs.plugins.blueprint.spotless)
  alias(libs.plugins.blueprint.dependencyGuard)
}

android {
  namespace = "ktak.res"
}
