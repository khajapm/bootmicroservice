FROM openjdk:8-jre-alpine
LABEL maintainer "kpasha@deloitte.com"
ADD target/springbootms.jar spring-app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/spring-app.jar"]
