#Dockerfile for image creation from jar file
# We can use any of the base image I am using openjdk runtime as base image
FROM openjdk:11-jre-slim
WORKDIR /usr/src/app
COPY app.jar .
CMD ["java", "-jar", "app.jar"]
