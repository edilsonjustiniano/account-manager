plugins {
    java
    idea
    id("io.freefair.lombok") version "5.3.0"
}

version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    testCompile("junit", "junit", "4.12")
}
