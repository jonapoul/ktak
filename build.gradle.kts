@file:Suppress("DSL_SCOPE_VIOLATION")

plugins {
  // convention-kotlin.gradle.kts
  alias(libs.plugins.kotlin.android) apply false

  // convention-android.gradle.kts
  alias(libs.plugins.agp) apply false
  alias(libs.plugins.androidCacheFix) apply false

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

  // other
  alias(libs.plugins.dependencyAnalysis)
  alias(libs.plugins.dependencyGuard)
}

dependencyAnalysis {
  // See https://github.com/autonomousapps/dependency-analysis-gradle-plugin/wiki/Customizing-plugin-behavior
  issues {
    all {
      ignoreKtx(ignore = true)
      onRedundantPlugins { severity(value = "warn") }
      onUnusedDependencies { severity(value = "warn") }
      onUnusedAnnotationProcessors { severity(value = "fail") }
    }
  }
  dependencies {
    bundle("kotlin-stdlib") {
      includeGroup("org.jetbrains.kotlin")
    }
  }
}

dependencyGuard {
  configuration("classpath")
}
