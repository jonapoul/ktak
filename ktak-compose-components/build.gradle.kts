@file:Suppress("DSL_SCOPE_VIOLATION")

plugins {
  id("convention-android-lib")
  id("convention-kotlin")
  id("convention-android-compose")
  id("convention-detekt")
  id("convention-ktlint")
  id("convention-licensee")
  id("convention-publish")
  id("convention-spotless")
  id("convention-dependency-guard")
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
