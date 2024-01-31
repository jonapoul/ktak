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
  namespace = "dev.jonpoulton.ktak.dagger"
}

dependencies {
  api(projects.ktakPlugin)

  compileOnly(projects.ktakCore)
  compileOnly(libs.alakazam.android.core)
  compileOnly(libs.alakazam.kotlin.core)
  compileOnly(libs.alakazam.kotlin.time)
  compileOnly(libs.flowpreferences)

  implementation(libs.dagger.core)
  kapt(libs.dagger.compiler)
}
