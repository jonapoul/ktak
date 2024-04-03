@file:Suppress("DSL_SCOPE_VIOLATION")

plugins {
  alias(libs.plugins.blueprint.android.compose) apply false
  alias(libs.plugins.blueprint.android.library) apply false
  alias(libs.plugins.blueprint.android.resources) apply false
  alias(libs.plugins.blueprint.atak.library) apply false
  alias(libs.plugins.blueprint.atak.plugin) apply false
  alias(libs.plugins.blueprint.detekt) apply false
  alias(libs.plugins.blueprint.ktlint) apply false
  alias(libs.plugins.blueprint.kotlin.android) apply false
  alias(libs.plugins.blueprint.licensee) apply false
  alias(libs.plugins.dokka) apply false
  alias(libs.plugins.publish) apply false
  alias(libs.plugins.spotless) apply false

  alias(libs.plugins.blueprint.dependencyGuard)
  alias(libs.plugins.blueprint.dependencyAnalysis)
  alias(libs.plugins.doctor)
  alias(libs.plugins.blueprint.diagrams)
  alias(libs.plugins.blueprint.kover)
  alias(libs.plugins.blueprint.versions)
}

doctor {
  javaHome {
    ensureJavaHomeMatches.set(false)
    ensureJavaHomeIsSet.set(true)
    failOnError.set(true)
  }
}
