<p align="center">
  <img src="docs/ktak.png" />
</p>

<p align="center">
  <a href="https://opensource.org/licenses/Apache-2.0"><img alt="License" src="https://img.shields.io/badge/License-Apache%202.0-blue.svg"/></a>
  <a href="https://github.com/jonapoul/ktak/releases/latest"><img alt="GitHub Release" src="https://img.shields.io/github/v/release/jonapoul/ktak?label=Release"/></a> <br>
  <a href="https://github.com/jonapoul/ktak/releases/latest"><img alt="Maven Version" src="https://img.shields.io/maven-central/v/dev.jonpoulton.ktak/core?label=Maven%20Central"/></a> <br>
</p>

## Summary

> - ***K = Kotlin***
> - ***TAK = Tactical Assault Kit***

This is a set of libraries to hold a bunch of common components and utility classes/functions that I find useful for developing ATAK plugins using Kotlin. Also includes a framework for developing plugin UIs with Jetpack Compose.

No real documentation (yet?).

## Usage

Add `mavenCentral()` to your `repositories` block. This might be in your root `build.gradle.kts` file, or in `settings.gradle.kts` - depending on how your project is set up.

Then add the dependencies build files to your project as below, using the latest release in this repo as the version:

```kotlin
dependencies {
  val latestVersion: String = ...

  // Regular ATAK
  implementation("dev.jonpoulton.ktak:core:${latestVersion}")
  implementation("dev.jonpoulton.ktak:plugin:${latestVersion}")
  implementation("dev.jonpoulton.ktak:poolingcontainer:${latestVersion}")
  implementation("dev.jonpoulton.ktak:res:${latestVersion}")
  implementation("dev.jonpoulton.ktak:ui:${latestVersion}")

  // Dependency Injection via Dagger
  implementation("dev.jonpoulton.ktak:dagger:${latestVersion}")

  // Jetpack Compose
  implementation("dev.jonpoulton.ktak:compose-components:${latestVersion}")
  implementation("dev.jonpoulton.ktak:compose-core:${latestVersion}")
  implementation("dev.jonpoulton.ktak:compose-icons:${latestVersion}")
  implementation("dev.jonpoulton.ktak:compose-navigation:${latestVersion}")
  implementation("dev.jonpoulton.ktak:compose-preview:${latestVersion}")
}
```

## TODO
- Fix janky icons
- Write docs?
  - Add sample plugin project?
