# Use a base image with JDK installed
FROM openjdk:11-jdk-slim

# Set working directory
WORKDIR /app

# Copy the source code
COPY src /app/src

# Compile the Java source files
RUN javac -d /app/out /app/src/*.java

# Set the classpath
ENV CLASSPATH=/app/out

# Expose the port for potential socket communication (if necessary)
EXPOSE 5555

# Command to run the application
CMD ["java", "App"]
