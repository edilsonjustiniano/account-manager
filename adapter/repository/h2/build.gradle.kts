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

    implementation("org.springframework.boot", "spring-boot-starter-data-jpa", "2.2.9.RELEASE")

    implementation("com.h2database", "h2", "1.4.200")
    testCompile("junit", "junit", "4.12")
}
