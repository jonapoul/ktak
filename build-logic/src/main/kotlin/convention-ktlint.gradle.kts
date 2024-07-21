import blueprint.recipes.ktlintBlueprint
import org.gradle.accessors.dm.LibrariesForLibs

val libs = the<LibrariesForLibs>()

ktlintBlueprint(
  ktlintCliVersion = libs.versions.ktlint.cli,
  ktlintComposeVersion = libs.versions.androidx.compose.lint.twitter,
)
