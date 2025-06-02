plugins {
    id("java")
    id("checkstyle")
    application
    id("org.sonarqube") version "6.0.1.5171"
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

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}

checkstyle {
    toolVersion = "10.12.1" // Актуальная версия Checkstyle
    configFile = file("${project.rootDir}/config/checkstyle/checkstyle.xml")
    isIgnoreFailures = false // Остановка сборки при ошибках
}

sonar {
    properties {
        property("sonar.projectKey", "Parsifal777_java-project-61")
        property("sonar.organization", "parsifal777")
        property("sonar.host.url", "https://sonarcloud.io")
    }
}