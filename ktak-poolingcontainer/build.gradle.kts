@file:Suppress("DSL_SCOPE_VIOLATION")

plugins {
  id("convention-android-lib")
  id("convention-android-res")
  id("convention-kotlin")
  id("convention-detekt")
  id("convention-ktlint")
  id("convention-licensee")
  id("convention-publish")
  id("convention-spotless")
  id("convention-dependency-guard")
}

android {
  namespace = "ktak.poolingcontainer"
}

dependencies {
  compileOnly(libs.androidx.annotation)
}
