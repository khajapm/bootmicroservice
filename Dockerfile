FROM openjdk:8-jre-alpine
LABEL maintainer "kpasha@deloitte.com"
ADD target/springbootms-0.0.1-SNAPSHOT.jar spring-app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/spring-app.jar"]
