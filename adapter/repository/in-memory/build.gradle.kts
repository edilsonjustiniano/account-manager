plugins {
    java
    id("io.freefair.lombok") version "5.3.0"
}

version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(
        project(":account.manager.core.entity")
    )
    implementation(
        project(":account.manager.core.usecase")
    )
    testCompile("junit", "junit", "4.12")
}
