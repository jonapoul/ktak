plugins {
  kotlin("android")
  id("convention-android")
  id("convention-kotlin")
  id("convention-atak")
  id("convention-publish")
  id("convention-style")
  kotlin("kapt")
}

android {
  namespace = "ktak.dagger"
}

dependencies {
  api(projects.ktakPlugin)

  compileOnly(projects.ktakCore)

  implementation(libs.dagger.core)
  kapt(libs.dagger.compiler)
}
