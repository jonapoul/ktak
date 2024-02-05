@file:Suppress("UnstableApiUsage")

import kotlinx.kover.gradle.plugin.dsl.AggregationType
import kotlinx.kover.gradle.plugin.dsl.MetricType
import org.gradle.accessors.dm.LibrariesForLibs
import org.gradle.api.tasks.testing.logging.TestExceptionFormat

plugins {
  id("org.jetbrains.kotlinx.kover")
}

tasks.withType<Test> {
  testLogging {
    exceptionFormat = TestExceptionFormat.FULL
    showCauses = true
    showExceptions = true
    showStackTraces = true
    showStandardStreams = true
  }
}

val isAndroid = project.isAndroid()
val shouldRunOnCheck = project == rootProject

koverReport {
  filters {
    includes { packages("dev.jonpoulton.ktak") }
    excludes {
      classes(
        "*Hilt_*",
        "*_Factory*",
      )
      packages(
        "*hilt_aggregated_deps.*",
        "*.di.*",
      )
    }
  }

  defaults {
    if (isAndroid) {
      mergeWith("debug")
    }

    html {
      onCheck = shouldRunOnCheck
    }

    log {
      onCheck = shouldRunOnCheck
      coverageUnits = MetricType.INSTRUCTION
      aggregationForGroup = AggregationType.COVERED_PERCENTAGE
    }

    verify {
      onCheck = shouldRunOnCheck
      rule {
        isEnabled = shouldRunOnCheck
        bound {
          minValue = 50
          metric = MetricType.INSTRUCTION
          aggregation = AggregationType.COVERED_PERCENTAGE
        }
      }
    }
  }

  if (isAndroid) {
    androidReports("debug") {
      // No-op, all same config as default
    }
  }
}

val libs = the<LibrariesForLibs>()
val testImplementation = configurations.findByName("testImplementation")

dependencies {
  testImplementation?.let { testImplementation ->
    testImplementation(libs.test.junit)
    testImplementation(libs.test.kotlin.common)
    testImplementation(libs.test.kotlin.junit)
    testImplementation(libs.test.kotlinx.coroutines)
    testImplementation(libs.test.mockk.android)
    testImplementation(libs.test.mockk.core)
    testImplementation(libs.test.turbine)

    if (isAndroid) {
      testImplementation(libs.test.androidx.arch)
      testImplementation(libs.test.androidx.coreKtx)
      testImplementation(libs.test.androidx.junit)
      testImplementation(libs.test.androidx.rules)
      testImplementation(libs.test.robolectric)
    }
  }
}

rootProject.dependencies {
  // Include this module in test coverage
  kover(project)
}
