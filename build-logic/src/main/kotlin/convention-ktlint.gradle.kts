import org.gradle.accessors.dm.LibrariesForLibs
import org.jlleitschuh.gradle.ktlint.KtlintExtension
import org.jlleitschuh.gradle.ktlint.reporter.ReporterType

plugins {
  id("org.jlleitschuh.gradle.ktlint")
}

val libs = the<LibrariesForLibs>()

ktlint {
  android.set(true)
  coloredOutput.set(true)
  enableExperimentalRules.set(false)
  ignoreFailures.set(false)
  verbose.set(true)
  version.set(libs.versions.ktlint.cli.get())

  reporters {
    reporter(ReporterType.HTML)
  }
}
