FROM openjdk:8-jdk-alpine

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} app.jar

ENTRYPOINT ["./wait-for-it.sh", "db:5432", "java","-jar","/app.jar"]