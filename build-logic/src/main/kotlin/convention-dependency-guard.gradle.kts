plugins {
  id("com.dropbox.dependency-guard")
}

dependencyGuard {
  configuration("debugCompileClasspath")
  configuration("debugRuntimeClasspath")
  configuration("debugUnitTestCompileClasspath")
  configuration("debugUnitTestRuntimeClasspath")
  configuration("releaseCompileClasspath")
  configuration("releaseRuntimeClasspath")
  configuration("releaseUnitTestCompileClasspath")
  configuration("releaseUnitTestRuntimeClasspath")
}
