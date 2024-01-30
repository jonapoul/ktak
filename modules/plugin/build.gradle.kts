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
  namespace = "dev.jonpoulton.ktak.plugin"
}

dependencies {
  api(projects.modules.core)
  implementation(libs.timber)
}
