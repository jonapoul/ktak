@file:Suppress("DSL_SCOPE_VIOLATION")

plugins {
  alias(libs.plugins.blueprint.android.library)
  alias(libs.plugins.blueprint.android.compose)
  alias(libs.plugins.blueprint.atak.library)
  alias(libs.plugins.blueprint.detekt)
  alias(libs.plugins.blueprint.ktlint)
  id("convention-licensee")
  id("convention-publish")
  id("convention-spotless")
  alias(libs.plugins.blueprint.dependencyGuard)
}

android {
  namespace = "ktak.compose.core"
}

dependencies {
  api(projects.ktakCore)
  api(projects.ktakPlugin)
  api(libs.androidx.compose.runtime)
  api(libs.androidx.compose.ui.core)
  api(libs.androidx.compose.ui.text)
  api(libs.androidx.compose.material.core)
  api(libs.androidx.lifecycle.common)

  implementation(projects.ktakRes)
  implementation(libs.androidx.annotation)
  implementation(libs.androidx.compose.ui.graphics)
  implementation(libs.androidx.compose.ui.unit)
  implementation(libs.androidx.compose.foundation.core)
  implementation(libs.androidx.lifecycle.viewmodelCompose)
  implementation(libs.timber)

  debugRuntimeOnly(libs.androidx.compose.ui.tooling)
}
