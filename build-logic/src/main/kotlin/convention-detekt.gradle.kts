plugins {
  id("io.gitlab.arturbosch.detekt")
}

detekt {
  buildUponDefaultConfig = true
  config.setFrom(rootProject.files("detekt.yml"))
  ignoreFailures = false
}

tasks.detekt {
  reports {
    html.required.set(true)
  }
}
