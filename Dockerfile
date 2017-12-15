FROM openjdk:8-jre-alpine
LABEL maintainer "kpasha@deloitte.com"
WORKDIR ~/circleci-spring
ADD target/springbootms.jar spring-app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/spring-app.jar"]
