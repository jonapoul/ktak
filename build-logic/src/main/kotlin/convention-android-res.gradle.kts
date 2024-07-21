import blueprint.recipes.androidResourcesBlueprint

plugins {
  id("convention-android-base")
}

androidResourcesBlueprint(viewBinding = false)
