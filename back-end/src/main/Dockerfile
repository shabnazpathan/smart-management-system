# Build Stage
FROM maven:3.8.5-openjdk-17 as builder
COPY . /app
WORKDIR /app
RUN mvn clean install

# Run Stage
FROM openjdk:17-jdk-slim
COPY --from=builder /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
