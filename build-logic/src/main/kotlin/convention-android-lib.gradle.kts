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

    resources {
      pickFirsts.addAll(listOf("MANIFEST.MF"))
      excludes.addAll(listOf("META-INF/*"))
    }
  }
}
