@file:Suppress("DSL_SCOPE_VIOLATION")

import com.autonomousapps.DependencyAnalysisExtension
import com.github.benmanes.gradle.versions.updates.DependencyUpdatesTask

plugins {
  alias(libs.plugins.blueprint.android.compose) apply false
  alias(libs.plugins.blueprint.android.library) apply false
  alias(libs.plugins.blueprint.android.resources) apply false
  alias(libs.plugins.blueprint.atak.library) apply false
  alias(libs.plugins.blueprint.atak.plugin) apply false
  alias(libs.plugins.blueprint.ktlint) apply false
  alias(libs.plugins.blueprint.kotlin.android) apply false
  alias(libs.plugins.detekt) apply false
  alias(libs.plugins.dokka) apply false
  alias(libs.plugins.licensee) apply false
  alias(libs.plugins.publish) apply false
  alias(libs.plugins.spotless) apply false

  alias(libs.plugins.blueprint.dependencyGuard)
  alias(libs.plugins.dependencyAnalysis)
  alias(libs.plugins.doctor)
  alias(libs.plugins.blueprint.kover)
  alias(libs.plugins.versions)
}

doctor {
  javaHome {
    ensureJavaHomeMatches.set(false)
    ensureJavaHomeIsSet.set(true)
    failOnError.set(true)
  }
}

tasks.withType(DependencyUpdatesTask::class.java) {
  rejectVersionIf { !candidate.version.isStable() && currentVersion.isStable() }
}

fun String.isStable(): Boolean = listOf("alpha", "beta", "rc").none { toLowerCase().contains(it) }

extensions.configure(DependencyAnalysisExtension::class.java) {
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
