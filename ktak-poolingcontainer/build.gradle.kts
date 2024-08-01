plugins {
  id("convention-android-lib")
  id("convention-android-res")
  id("convention-kotlin")
  id("convention-publish")
  id("convention-style")
  id("convention-dependency-guard")
}

android {
  namespace = "ktak.poolingcontainer"
}

dependencies {
  compileOnly(libs.androidx.annotation)
}
