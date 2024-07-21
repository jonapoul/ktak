import blueprint.recipes.kotlinJvmBlueprint
import org.gradle.accessors.dm.LibrariesForLibs

plugins {
  kotlin("android")
}

val libs = the<LibrariesForLibs>()

kotlinJvmBlueprint(kotlinVersion = libs.versions.kotlin)
