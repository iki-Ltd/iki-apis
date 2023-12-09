FROM openjdk:17-alpine
COPY target/iki-backend-0.0.1-SNAPSHOT.jar iki.jar
ENTRYPOINT ["java", "-jar","/iki.jar"]