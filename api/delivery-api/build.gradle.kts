dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:${property("openApiVersion")}")
    implementation("io.jsonwebtoken:jjwt-api:${property("jwtVersion")}")
    implementation("io.jsonwebtoken:jjwt-impl:${property("jwtVersion")}")
    implementation("io.jsonwebtoken:jjwt-jackson:${property("jwtVersion")}")

    developmentOnly("org.springframework.boot:spring-boot-devtools")

    runtimeOnly("com.h2database:h2")
}