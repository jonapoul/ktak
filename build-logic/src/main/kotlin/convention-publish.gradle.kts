plugins {
  id("com.vanniktech.maven.publish")
  id("org.jetbrains.dokka")
}

publishing {
  repositories {
    maven {
      name = "MavenLocalProper"
      url = mavenLocal().url
    }
  }
}
