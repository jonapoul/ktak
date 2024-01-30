# KTak (Kotlin ATAK)

![CI](https://github.com/jonapoul/ktak/actions/workflows/ci.yml/badge.svg)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/dev.jonpoulton.ktak/core/badge.svg)](https://maven-badges.herokuapp.com/maven-central/dev.jonpoulton.ktak/core)

This is a library to hold a bunch of common components that I find useful for developing my own custom ATAK plugins.

## Usage

Add `mavenCentral()` to your `repositories` block. This might be in your root build file, or in `settings.gradle.kts` - depending on how your project is set up.

Then add the dependencies build files to your project as below, using the latest release in this repo as the version:

```kotlin
dependencies {
    // Regular ATAK
    implementation("dev.jonpoulton.ktak:core:{version}")
    implementation("dev.jonpoulton.ktak:plugin:{version}")
    implementation("dev.jonpoulton.ktak:res:{version}")
    implementation("dev.jonpoulton.ktak:ui:{version}")
    implementation("dev.jonpoulton.ktak:viewmodel:{version}")

    // Dependency Injection via Dagger
    implementation("dev.jonpoulton.ktak:dagger:{version}")

    // Jetpack Compose
    implementation("dev.jonpoulton.ktak:compose-components:{version}")
    implementation("dev.jonpoulton.ktak:compose-core:{version}")
    implementation("dev.jonpoulton.ktak:compose-icons:{version}")
    implementation("dev.jonpoulton.ktak:compose-plugin:{version}")
    implementation("dev.jonpoulton.ktak:compose-viewmodel:{version}")
    compileOnly("dev.jonpoulton.ktak:compose-preview:{version}") // for previews only, not runtime
}
```
