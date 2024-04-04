@file:Suppress("UnstableApiUsage")

plugins {
  id("convention-android-base")
}

android {
  buildFeatures {
    androidResources = true
    resValues = true
  }
}
