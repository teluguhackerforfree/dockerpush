FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

COPY target/java-docker-demo-1.0.jar app.jar

CMD ["java","-jar","app.jar"]
