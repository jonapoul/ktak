import blueprint.core.stringProperty
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  kotlin("android")
}

val javaVersion = stringProperty(key = "javaVersion")

kotlin {
  jvmToolchain(javaVersion.toInt())
  explicitApi()
}

tasks.withType(KotlinCompile::class.java) {
  kotlinOptions {
    jvmTarget = javaVersion
    freeCompilerArgs += listOf(
      "-opt-in=kotlin.RequiresOptIn",
      "-Xjvm-default=all-compatibility",
      "-Xexplicit-api=strict",
    )
  }
}
