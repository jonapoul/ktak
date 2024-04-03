plugins {
  `kotlin-dsl`
}

val javaVersion = properties["javaVersion"].toString()

java {
  sourceCompatibility = JavaVersion.toVersion(javaVersion)
  targetCompatibility = JavaVersion.toVersion(javaVersion)
}

kotlinDslPluginOptions {
  jvmTarget.set(javaVersion)
}

dependencies {
  // https://stackoverflow.com/a/70878181/15634757
  implementation(files(libs.javaClass.superclass.protectionDomain.codeSource.location))
}
