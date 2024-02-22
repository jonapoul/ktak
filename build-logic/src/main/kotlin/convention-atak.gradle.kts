@file:Suppress("UnstableApiUsage")

import org.gradle.accessors.dm.LibrariesForLibs

val compileOnly by configurations
val testImplementation by configurations

val libs = the<LibrariesForLibs>()

// Fetch these from the mavenLocal repo on my local machine
dependencies {
  compileOnly(libs.atak.sdk)
  testImplementation(libs.atak.sdk)
}
