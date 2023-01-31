FROM openjdk:11
EXPOSE 8080
COPY /target/spring-doctorapp-rest.jar spring-doctorapi.jar
ENTRYPOINT [ "java","-jar","spring-doctorapi.jar" ]