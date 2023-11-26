FROM openjdk:17-alpine
COPY target/iki.jar iki.jar
ENTRYPOINT ["java", "-jar","/iki.jar"]