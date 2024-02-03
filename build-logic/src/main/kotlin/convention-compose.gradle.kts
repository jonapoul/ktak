@file:Suppress("UnstableApiUsage")

import com.android.build.api.dsl.CommonExtension
import org.gradle.accessors.dm.LibrariesForLibs
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  kotlin("android")
  id("convention-android")
  id("convention-kotlin")
}

val libs = the<LibrariesForLibs>()

extensions.getByType(CommonExtension::class).apply {
  buildFeatures {
    compose = true
  }

  composeOptions {
    kotlinCompilerExtensionVersion = libs.versions.androidx.compose.compiler.get()
  }
}

val compileOnly by configurations
val implementation by configurations
val debugImplementation by configurations

dependencies {
  implementation(platform(libs.androidx.compose.bom))
  implementation(libs.androidx.compose.foundation)
  implementation(libs.androidx.compose.material.core)
  implementation(libs.androidx.compose.ui.core)
  compileOnly(libs.androidx.compose.ui.preview)
  debugImplementation(libs.androidx.compose.ui.tooling)
}

tasks.withType<KotlinCompile> {
  kotlinOptions {
    freeCompilerArgs += listOf(
      "-opt-in=androidx.compose.foundation.ExperimentalFoundationApi",
      "-opt-in=androidx.compose.material.ExperimentalMaterialApi",
    )
  }
}
