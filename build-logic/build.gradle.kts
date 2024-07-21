@file:Suppress("DSL_SCOPE_VIOLATION")

plugins {
  `kotlin-dsl`
}

val javaVersion = properties["javaVersion"].toString()

java {
  sourceCompatibility = JavaVersion.toVersion(javaVersion)
  targetCompatibility = JavaVersion.toVersion(javaVersion)
}

kotlinDslPluginOptions {
  jvmTarget.set(javaVersion)
}

dependencies {
  implementation(libs.plugin.agp)
  implementation(libs.plugin.androidCacheFix)
  implementation(libs.plugin.blueprint.core)
  implementation(libs.plugin.blueprint.recipes)
  implementation(libs.plugin.dependencyGuard)
  implementation(libs.plugin.detekt)
  implementation(libs.plugin.dokka)
  implementation(libs.plugin.kotlin)
  implementation(libs.plugin.ktlint)
  implementation(libs.plugin.licensee)
  implementation(libs.plugin.publish)
  implementation(libs.plugin.spotless)

  // https://stackoverflow.com/a/70878181/15634757
  implementation(files(libs.javaClass.superclass.protectionDomain.codeSource.location))
}
