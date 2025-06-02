plugins {
    id("java")
    id("checkstyle")
    application
    id("org.sonarqube") version "4.4.1.3373"
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

application {
    mainClass.set("hexlet.code.App")
}

checkstyle {
    toolVersion = "10.12.1"
    configFile = file("${project.rootDir}/config/checkstyle/checkstyle.xml")
    isIgnoreFailures = false
}
tasks.checkstyleMain {
    enabled = false
}
sonar {
    properties {
        property("sonar.projectKey", "Parsifal777_java-project-61")
        property("sonar.organization", "parsifal777")
        property("sonar.host.url", "https://sonarcloud.io")
    }
}