FROM openjdk:8-jre-alpine
ADD target/springms-0.0.1-SNAPSHOT.jar springms.jar
ENTRYPOINT ["java","-jar","/springms.jar"]
