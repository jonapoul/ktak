@file:Suppress("DSL_SCOPE_VIOLATION")

import com.github.benmanes.gradle.versions.updates.DependencyUpdatesTask

plugins {
  alias(libs.plugins.blueprint.android.compose) apply false
  alias(libs.plugins.blueprint.android.library) apply false
  alias(libs.plugins.blueprint.android.resources) apply false
  alias(libs.plugins.blueprint.atak.library) apply false
  alias(libs.plugins.blueprint.atak.plugin) apply false
  alias(libs.plugins.blueprint.detekt) apply false
  alias(libs.plugins.blueprint.ktlint) apply false
  alias(libs.plugins.blueprint.kotlin.android) apply false
  alias(libs.plugins.licensee) apply false
  alias(libs.plugins.dokka) apply false
  alias(libs.plugins.publish) apply false
  alias(libs.plugins.spotless) apply false

  alias(libs.plugins.blueprint.dependencyGuard)
  alias(libs.plugins.blueprint.dependencyAnalysis)
  alias(libs.plugins.doctor)
  alias(libs.plugins.blueprint.diagrams)
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
