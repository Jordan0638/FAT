FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY target/* app.jar
CMD ["java", "-jar", "app.jar"]