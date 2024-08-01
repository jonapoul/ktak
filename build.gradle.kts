buildscript {
  repositories {
    mavenCentral()
    google()
    gradlePluginPortal()
    maven { url = uri("https://jitpack.io") }
  }

  dependencies {
    classpath(libs.plugin.publish)
  }
}

plugins {
  alias(libs.plugins.agp.lib) apply false
  alias(libs.plugins.detekt) apply false
  alias(libs.plugins.dokka) apply false
  alias(libs.plugins.kotlin) apply false
  alias(libs.plugins.ktlint) apply false
  alias(libs.plugins.licensee) apply false
  alias(libs.plugins.spotless) apply false

  alias(libs.plugins.dependencyGuard)
  alias(libs.plugins.dependencyAnalysis)
  alias(libs.plugins.doctor)
  alias(libs.plugins.versions)
}

dependencyGuard {
  configuration("classpath")
}

doctor {
  javaHome {
    ensureJavaHomeMatches.set(false)
    ensureJavaHomeIsSet.set(true)
    failOnError.set(true)
  }
}

tasks.dependencyUpdates {
  rejectVersionIf { !candidate.version.isStable() && currentVersion.isStable() }
}

fun String.isStable(): Boolean = listOf("alpha", "beta", "rc").none { toLowerCase().contains(it) }

dependencyAnalysis {
  issues {
    all {
      ignoreKtx(ignore = true)
      onAny {
        severity(value = "fail")

        // https://github.com/autonomousapps/dependency-analysis-gradle-plugin/issues/884
        exclude("() -> java.io.File?")
      }
    }
  }

  dependencies {
    bundle(name = "kotlin-stdlib") { includeGroup(group = "org.jetbrains.kotlin") }
  }
}
