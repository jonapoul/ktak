import blueprint.recipes.atakBlueprint
import org.gradle.accessors.dm.LibrariesForLibs

val libs = the<LibrariesForLibs>()

atakBlueprint(atakSdk = libs.atak.sdk)
