@file:Suppress("DSL_SCOPE_VIOLATION")

plugins {
  alias(libs.plugins.blueprint.android.library)
  alias(libs.plugins.blueprint.android.compose)
  alias(libs.plugins.blueprint.android.resources)
  id("convention-detekt")
  id("convention-ktlint")
  id("convention-licensee")
  id("convention-publish")
  id("convention-spotless")
  alias(libs.plugins.blueprint.dependencyGuard)
}

android {
  namespace = "ktak.compose.preview"
}

dependencies {
  api(libs.androidx.compose.runtime)
  api(libs.androidx.compose.ui.core)

  implementation(projects.ktakCore)
  implementation(projects.ktakComposeCore)
  implementation(libs.androidx.compose.foundation.core)
  implementation(libs.androidx.compose.foundation.layout)
  implementation(libs.androidx.compose.material.core)
  implementation(libs.androidx.compose.ui.graphics)
  implementation(libs.androidx.compose.ui.unit)

  debugRuntimeOnly(libs.androidx.compose.ui.tooling)
}
