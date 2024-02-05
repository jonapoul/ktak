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
  api(libs.javax.inject)
  api(libs.dagger.core)

  compileOnly(projects.ktakCore)

  kapt(libs.dagger.compiler)
}
