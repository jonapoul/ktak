@file:Suppress("UnstableApiUsage")

plugins {
  id("convention-android")
  id("convention-publish")
  id("convention-style-licensee")
  id("convention-style-spotless")
}

android {
  namespace = "ktak.res"

  buildFeatures {
    resValues = true
  }
}
