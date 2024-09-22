FROM openjdk:17-alpine
COPY target/*.jar spring-boot-app.jar
ENTRYPOINT ["java", "-jar", "/spring-boot-app.jar"]
