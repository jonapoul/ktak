plugins {
  id("convention-android-lib")
  id("convention-kotlin")
  id("convention-atak")
  id("convention-publish")
  id("convention-style")
  id("convention-dependency-guard")
}

android {
  namespace = "ktak.dagger"
}

dependencies {
  implementation(libs.javax.inject)
  compileOnly(projects.ktakCore)
}
