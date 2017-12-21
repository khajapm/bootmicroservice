FROM openjdk:8-jre-alpine
LABEL maintainer "kpasha@deloitte.com"
WORKDIR ~/circleci-spring
COPY target/springbootms.jar springbootms.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","/springbootms.jar"]
