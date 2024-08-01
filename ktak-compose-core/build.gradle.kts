plugins {
  id("convention-android-lib")
  id("convention-kotlin")
  id("convention-android-compose")
  id("convention-atak")
  id("convention-publish")
  id("convention-style")
  id("convention-dependency-guard")
}

android {
  namespace = "ktak.compose.core"
}

dependencies {
  api(projects.ktakCore)
  api(projects.ktakPlugin)
  api(libs.androidx.compose.runtime)
  api(libs.androidx.compose.ui.core)
  api(libs.androidx.compose.ui.graphics)
  api(libs.androidx.compose.ui.text)
  api(libs.androidx.compose.material.core)

  implementation(projects.ktakRes)
  implementation(libs.androidx.annotation)
  implementation(libs.androidx.compose.ui.unit)
  implementation(libs.androidx.compose.foundation.core)
  implementation(libs.androidx.lifecycle.viewmodelCompose)
  implementation(libs.timber)

  debugRuntimeOnly(libs.androidx.compose.ui.tooling)
}
