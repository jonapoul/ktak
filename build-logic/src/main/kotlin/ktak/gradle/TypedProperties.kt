@file:Suppress("TooManyFunctions")

package ktak.gradle

import groovy.lang.MissingPropertyException
import org.gradle.api.Project

fun Project.stringPropertyOrNull(key: String): String? {
  return properties[key]?.toString()
}

@Throws(MissingPropertyException::class)
fun Project.stringProperty(key: String): String {
  return stringPropertyOrNull(key) ?: throw MissingPropertyException("No string property", key, String::class.java)
}

fun Project.intPropertyOrNull(key: String): Int? {
  return stringPropertyOrNull(key)?.toIntOrNull()
}

@Throws(MissingPropertyException::class)
fun Project.intProperty(key: String): Int {
  return intPropertyOrNull(key) ?: throw MissingPropertyException("No int property", key, Int::class.java)
}
