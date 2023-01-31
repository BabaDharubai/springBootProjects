FROM openjdk:11
EXPOSE 8080
COPY /target/spring-rest.jar spring-api.jar
ENTRYPOINT [ "java","-jar","spring-api.jar" ]