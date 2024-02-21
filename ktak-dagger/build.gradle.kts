plugins {
  kotlin("android")
  id("convention-android")
  id("convention-kotlin")
  id("convention-atak")
  id("convention-publish")
  id("convention-style")
}

android {
  namespace = "ktak.dagger"
}

dependencies {
  implementation(libs.javax.inject)
  compileOnly(projects.ktakCore)
}
