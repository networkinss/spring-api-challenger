FROM amazoncorretto:11-alpine-jdk
MAINTAINER baeldung.com
COPY target/petstoretroublemaker-0.0.1.jar troublemaker.jar
ENTRYPOINT ["java","-jar","/troublemaker.jar"]