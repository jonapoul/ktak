plugins {
  id("com.dropbox.dependency-guard")
}

dependencyGuard {
  configuration("releaseCompileClasspath")
  configuration("releaseRuntimeClasspath")
}
