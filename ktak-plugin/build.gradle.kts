plugins {
  kotlin("android")
  id("convention-android")
  id("convention-kotlin")
  id("convention-atak")
  id("convention-publish")
  id("convention-style")
  id("convention-test")
}

android {
  namespace = "ktak.plugin"
}

dependencies {
  api(projects.ktakCore)
  api(libs.timber)
}
