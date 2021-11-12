FROM openjdk:15
EXPOSE 8080
ADD target/docker-spring-boot.jar docker-spring-boot.jar
ENTRYPOINT ["java", "-Dspring.data.mongodb.uri=mongodb://host.docker.internal:27017/employees","-Djava.security.egd=file:/dev/./urandom", "-jar", "/docker-spring-boot.jar"]
#ENTRYPOINT ["java" "-jar", "/docker-spring-boot.jar"]