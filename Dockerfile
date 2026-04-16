# Replace the deprecated openjdk:17-jdk-slim
FROM eclipse-temurin:17-jdk-alpine

# The rest of your Dockerfile remains the same
WORKDIR /app
COPY target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]

