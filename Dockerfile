FROM openjdk:8
ADD target/docker-spring-boot-mongodb.jar docker-spring-boot-mongodb.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","docker-spring-boot-mongodb.jar"]

