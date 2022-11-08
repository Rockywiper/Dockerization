FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} employee.jar
ENTRYPOINT ["java","-jar","/employee.jar"]
