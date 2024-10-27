# Stage 1: Build
FROM docker.io/library/maven:3.8.1-openjdk-17 AS BUILD
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Stage 2: Runtime
FROM docker.io/library/openjdk:17-jdk-slim
COPY --from=BUILD /app/target/my-java-api-1.0-SNAPSHOT.jar my-java-api.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/my-java-api.jar"]

