import blueprint.recipes.DEFAULT_COMPOSE_EXPERIMENTAL_APIS
import blueprint.recipes.androidComposeBlueprint
import org.gradle.accessors.dm.LibrariesForLibs

plugins {
  id("convention-android-base")
  id("convention-kotlin")
}

val libs = the<LibrariesForLibs>()

androidComposeBlueprint(
  composeCompilerVersion = libs.versions.androidx.compose.compiler,
  composeBomVersion = libs.versions.androidx.compose.bom,
  composeLintVersion = libs.versions.androidx.compose.lint.slack,
  experimentalApis = DEFAULT_COMPOSE_EXPERIMENTAL_APIS + "androidx.compose.material.ExperimentalMaterialApi",
  writeMetrics = true,
)

val compileOnly by configurations

dependencies {
  compileOnly(libs.androidx.compose.ui.preview)
}
