FROM amazoncorretto: 1.8-alpine-jdk
MAINTAINER SRM
COPY target/SRM-0.0.1-SNAPSHOT srm-app.jar
ENTRYPOINT ["java","-jar","/srm-app.jar"]
