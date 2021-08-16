plugins {
    kotlin("jvm") version Versions.Kotlin
}

group = "eu.kevin"
version = "0.1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("io.ktor:ktor-client-okhttp:${Versions.Ktor}")
}