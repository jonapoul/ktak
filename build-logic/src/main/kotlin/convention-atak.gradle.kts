@file:Suppress("UnstableApiUsage", "SpellCheckingInspection")

import org.gradle.accessors.dm.LibrariesForLibs
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.getValue
import org.gradle.kotlin.dsl.provideDelegate
import org.gradle.kotlin.dsl.the

val libs = the<LibrariesForLibs>()
val compileOnly by configurations
val testImplementation by configurations

dependencies {
  compileOnly(libs.atak.sdk)
  testImplementation(libs.atak.sdk)
}

configurations.configureEach {
  listOf(
    "androidx.activity" to "activity",
    "androidx.annotation" to "annotation",
    "androidx.annotation" to "annotation-experimental",
    "androidx.arch.core" to "core-common",
    "androidx.arch.core" to "core-runtime",
    "androidx.collection" to "collection",
    "androidx.concurrent" to "concurrent-futures",
    "androidx.core" to "core",
    "androidx.core" to "core-ktx",
    "androidx.customview" to "customview",
    "androidx.customview" to "customview-poolingcontainer",
    "androidx.exifinterface" to "exifinterface",
    "androidx.fragment" to "fragment",
    "androidx.lifecycle" to "lifecycle-livedata",
    "androidx.lifecycle" to "lifecycle-livedata-core",
    "androidx.lifecycle" to "lifecycle-process",
    "androidx.lifecycle" to "lifecycle-runtime",
    "androidx.lifecycle" to "lifecycle-runtime-ktx",
    "androidx.lifecycle" to "lifecycle-viewmodel",
    "androidx.lifecycle" to "lifecycle-viewmodel-savedstate",
    "androidx.loader" to "loader",
    "androidx.localbroadcastmanager" to "localbroadcastmanager",
    "androidx.profileinstaller" to "profileinstaller",
    "androidx.savedstate" to "savedstate",
    "androidx.startup" to "startup-runtime",
    "androidx.tracing" to "tracingsavedstate",
    "androidx.versionedparcelable" to "versionedparcelable",
    "androidx.viewpager" to "viewpager",
    "org.jetbrains.kotlinx" to "kotlinx-coroutines-core",
    "org.jetbrains.kotlinx" to "kotlinx-coroutines-core-jvm",
    "org.jetbrains.kotlinx" to "kotlinx-coroutines-android",
  ).forEach { (group, module) ->
    exclude(mapOf("group" to group, "module" to module))
  }
}
