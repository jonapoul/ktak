@file:Suppress("DSL_SCOPE_VIOLATION")

plugins {
  id("convention-android-res")
  id("convention-publish")
  id("convention-licensee")
  id("convention-spotless")
  alias(libs.plugins.blueprint.dependencyGuard)
}

android {
  namespace = "ktak.res"
}
