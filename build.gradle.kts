import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.jetbrains.kotlin.konan.properties.Properties

plugins {
    kotlin("jvm") version Versions.KOTLIN
    kotlin("plugin.serialization") version Versions.KOTLIN
    id("org.jlleitschuh.gradle.ktlint") version Versions.KTLINT
    `maven-publish`
    id("io.github.gradle-nexus.publish-plugin") version "1.1.0"
}

group = "eu.kevin"
version = "0.1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("io.ktor:ktor-client-core:${Versions.KTOR}")
    implementation("io.ktor:ktor-client-cio:${Versions.KTOR}")
    implementation("io.ktor:ktor-client-serialization:${Versions.KTOR}")

    testImplementation(kotlin("test"))
    testImplementation("io.ktor:ktor-client-mock:${Versions.KTOR}")
}

val compileKotlin: KotlinCompile by tasks

compileKotlin.kotlinOptions {
    jvmTarget = "1.8"
    freeCompilerArgs = freeCompilerArgs + "-Xopt-in=kotlin.RequiresOptIn"
}

tasks.test {
    useJUnitPlatform()
}

configureCodeStyleRules()

fun Project.configureCodeStyleRules() = configure<org.jlleitschuh.gradle.ktlint.KtlintExtension> {
    disabledRules.set(
        setOf(
            // can't be automatically fixed and does not affect code readability
            "no-wildcard-imports",
            // does not affect code readability
            "final-newline"
        )
    )
}

configure<PublishingExtension> {
    publications {
        create<MavenPublication>("kotlin") {
            from(components["kotlin"])
        }
    }
}

val props = File("./local.properties").let { file ->
    Properties().apply {
        if (file.exists()) {
            load(file.inputStream())
        } else {
            setProperty("ossrhUsername", System.getenv("OSSRH_USERNAME"))
            setProperty("ossrhPassword", System.getenv("OSSRH_PASSWORD"))
            setProperty("sdkVersion", System.getenv("SDK_RELEASE_VERSION"))
        }
    }
}

nexusPublishing {
    repositories {
        sonatype {
            username.set(props.getProperty("ossrhUsername"))
            password.set(props.getProperty("ossrhPassword"))
            nexusUrl.set(uri("https://s01.oss.sonatype.org/service/local/"))
            snapshotRepositoryUrl.set(uri("https://s01.oss.sonatype.org/content/repositories/snapshots/"))
        }
    }
}
