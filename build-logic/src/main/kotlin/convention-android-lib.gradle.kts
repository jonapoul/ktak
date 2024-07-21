@file:Suppress("UnstableApiUsage")

plugins {
  id("com.android.library")
  id("convention-android-base")
}

android {
  defaultConfig {
    multiDexEnabled = false
  }
}
