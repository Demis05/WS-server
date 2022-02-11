FROM openjdk:11.0.10-jre-slim-buster
VOLUME /tmp
COPY target/spring-cloud-template-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
