@file:Suppress("UnstableApiUsage")

import org.gradle.accessors.dm.LibrariesForLibs
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  id("convention-android-base")
  id("convention-kotlin")
}

val libs = the<LibrariesForLibs>()

android {
  buildFeatures {
    compose = true
  }

  composeOptions {
    kotlinCompilerExtensionVersion = libs.versions.androidx.compose.compiler.get()
  }
}

tasks.withType(KotlinCompile::class.java) {
  kotlinOptions {
    freeCompilerArgs += listOf(
      "-opt-in=androidx.compose.foundation.ExperimentalFoundationApi",
      "-opt-in=androidx.compose.ui.ExperimentalComposeUiApi",
      "-opt-in=androidx.compose.material.ExperimentalMaterialApi",
    )

    // From https://chrisbanes.me/posts/composable-metrics/
    val propertyRoot = "plugin:androidx.compose.compiler.plugins.kotlin"
    val metricReportDir = project.layout.buildDirectory.dir("compose_metrics").get().asFile
    freeCompilerArgs += listOf("-P", "$propertyRoot:reportsDestination=${metricReportDir.absolutePath}")
    freeCompilerArgs += listOf("-P", "$propertyRoot:metricsDestination=${metricReportDir.absolutePath}")
  }
}

val compileOnly by configurations
val implementation by configurations

dependencies {
  implementation(platform(libs.androidx.compose.bom))
  compileOnly(libs.androidx.compose.ui.preview)
}
