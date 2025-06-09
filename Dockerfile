# Use OpenJDK base image
FROM openjdk:17-jdk-alpine

# Set environment variables
ENV SPRING_OUTPUT_ANSI_ENABLED=ALWAYS \
    JAVA_OPTS=""

# Set working directory
WORKDIR /app

# Copy the JAR file (change the name if different)
COPY target/calculator-1.0.0.jar app.jar

# Expose the port Spring Boot uses
EXPOSE 80

# Run the JAR file
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar app.jar"]
