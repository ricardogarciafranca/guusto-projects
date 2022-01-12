#
# Build stage
#
FROM maven:3.6.0-jdk-8-slim AS build

COPY pom.xml .

RUN mvn clean install

#
# Package stage
#
FROM openjdk:8-jdk-alpine

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java","-jar","/app.jar"]