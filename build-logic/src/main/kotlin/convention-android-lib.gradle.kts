@file:Suppress("UnstableApiUsage")

plugins {
  id("convention-android-base")
}

android {
  defaultConfig {
    multiDexEnabled = false
  }

  packagingOptions {
    jniLibs {
      useLegacyPackaging = true
    }
  }
}
