import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.10"
    application
    id("org.jetbrains.dokka") version "1.6.10"
}

group = "me.benjamin"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.junit.jupiter:junit-jupiter:5.8.2")
    implementation("com.google.code.gson:gson:2.8.9") // GSON -> DataClass
    implementation("io.github.microutils:kotlin-logging-jvm:2.1.21") // LOGGER
    implementation("org.slf4j:slf4j-simple:1.7.33") // LOGGER
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}