import org.gradle.accessors.dm.LibrariesForLibs

plugins {
  id("io.gitlab.arturbosch.detekt")
}

detekt {
  buildUponDefaultConfig = true
  config.setFrom(rootProject.files("detekt.yml"))
  ignoreFailures = false
}

tasks.detekt {
  reports {
    html.required.set(true)
  }
}

val libs = the<LibrariesForLibs>()
val detektPlugins by configurations

dependencies {
  detektPlugins(libs.androidx.compose.twitter.detekt)
}
