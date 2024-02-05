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

dependencies {
  implementation(platform(libs.androidx.compose.bom))
  compileOnly(libs.androidx.compose.ui.preview)
}

tasks.withType<KotlinCompile> {
  kotlinOptions {
    freeCompilerArgs += listOf(
      "-opt-in=androidx.compose.foundation.ExperimentalFoundationApi",
      "-opt-in=androidx.compose.material.ExperimentalMaterialApi",
    )
  }
}
