FROM amazoncorretto:11-alpine-jdk
MAINTAINER SRM
COPY target/SRM-0.0.1-SNAPSHOT.jar srm-app.jar
ENTRYPOINT ["java","-jar","/srm-app.jar"]
