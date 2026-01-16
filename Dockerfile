# Use lightweight Java 17 JRE
FROM eclipse-temurin:17-jre

# Set working directory
WORKDIR /app

# Copy jar into container
COPY target/aws-cicd-app.jar app.jar

# Expose application port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
