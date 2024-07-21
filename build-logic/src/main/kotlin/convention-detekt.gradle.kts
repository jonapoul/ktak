import blueprint.recipes.detektBlueprint
import org.gradle.accessors.dm.LibrariesForLibs

val libs = the<LibrariesForLibs>()

detektBlueprint(composeDetektVersion = libs.versions.androidx.compose.lint.twitter)
