@file:Suppress("DSL_SCOPE_VIOLATION")

plugins {
  // convention-kotlin.gradle.kts
  alias(libs.plugins.kotlin.android) apply false

  // convention-android.gradle.kts
  alias(libs.plugins.agp) apply false

  // convention-publish.gradle.kts
  alias(libs.plugins.dokka) apply false
  alias(libs.plugins.publish) apply false

  // convention-style.gradle.kts
  alias(libs.plugins.detekt) apply false
  alias(libs.plugins.ktlint) apply false
  alias(libs.plugins.licensee) apply false
  alias(libs.plugins.spotless) apply false

  // convention-test.gradle.kts
  alias(libs.plugins.kover)

  // Other
  alias(libs.plugins.versions)
}

// Dependency versions config
tasks.dependencyUpdates.configure {
  rejectVersionIf {
    !candidate.version.isStable() && currentVersion.isStable()
  }
}

fun String.isStable(): Boolean = listOf("alpha", "beta", "rc").none { toLowerCase().contains(it) }
