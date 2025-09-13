plugins {
	java
	id("org.springframework.boot") version "3.5.5"
	id("io.spring.dependency-management") version "1.1.7"
	id("com.google.cloud.tools.jib") version "3.4.4"
}

group = "com.sydrome"
version = "0.0.1-SNAPSHOT"
description = "Key Value Store"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(21)
	}
}

configurations {
	compileOnly {
		extendsFrom(configurations.annotationProcessor.get())
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.boot:spring-boot-starter-jdbc")
	implementation("org.slf4j:slf4j-api:2.0.17")
	implementation("org.flywaydb:flyway-core:11.11.2")
	implementation("org.postgresql:postgresql:42.6.0")
	compileOnly("org.projectlombok:lombok")
	runtimeOnly("org.flywaydb:flyway-database-postgresql:11.11.2")
	annotationProcessor("org.projectlombok:lombok")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

jib {
    from {
        image = "eclipse-temurin:21-jdk"
    }
    to {
        image = "kvs:latest"
    }
    container {
        jvmFlags = listOf("-Xms512m", "-Xmx512m")
        ports = listOf("8080")
    }
}


tasks.withType<Test> {
	useJUnitPlatform()
}
