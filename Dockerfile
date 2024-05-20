# Use an official Eclipse Temurin runtime as a parent image
FROM eclipse-temurin:17-jdk-alpine

# Create a directory to hold the application files
WORKDIR /app

# VOLUME instruction creates a mount point with the specified path
VOLUME /tmp

# Copy the executable jar file to the working directory
COPY target/*.jar app.jar

# Expose port 8080
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "/app.jar"]
