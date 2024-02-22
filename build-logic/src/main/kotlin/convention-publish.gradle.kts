plugins {
  id("com.vanniktech.maven.publish")
  id("org.jetbrains.dokka")
}

publishing {
  repositories {
    maven {
      name = "MavenLocalProper"
      url = uri("file:///home/jon/.m2/repository/")
    }
  }
}
