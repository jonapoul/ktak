@file:Suppress("DSL_SCOPE_VIOLATION")

plugins {
  alias(libs.plugins.blueprint.android.library)
  alias(libs.plugins.blueprint.android.compose)
  alias(libs.plugins.blueprint.detekt)
  alias(libs.plugins.blueprint.ktlint)
  alias(libs.plugins.blueprint.licensee)
  id("convention-publish")
  id("convention-spotless")
  alias(libs.plugins.blueprint.dependencyGuard)
}

android {
  namespace = "ktak.compose.components"
}

dependencies {
  api(libs.androidx.compose.foundation.core)
  api(libs.androidx.compose.foundation.layout)
  api(libs.androidx.compose.runtime)
  api(libs.androidx.compose.material.core)
  api(libs.androidx.compose.ui.core)
  api(libs.androidx.compose.ui.graphics)
  api(libs.androidx.compose.ui.text)

  implementation(projects.ktakComposeCore)
  implementation(projects.ktakComposeIcons)
  implementation(libs.androidx.compose.animation)
  implementation(libs.androidx.compose.material.icons.core)
  implementation(libs.androidx.compose.material.icons.extended)
  implementation(libs.androidx.compose.material.ripple)
  implementation(libs.androidx.compose.ui.geometry)
  implementation(libs.androidx.compose.ui.unit)
  implementation(libs.androidx.compose.ui.util)
  implementation(libs.kotlinx.coroutines.core)
  implementation(libs.kotlinx.immutable)

  // only used for previews
  debugRuntimeOnly(libs.androidx.compose.ui.tooling)
  compileOnly(projects.ktakComposePreview)
}
