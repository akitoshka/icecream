FROM openjdk:8u201-jdk-alpine3.9
COPY ./target/icecream-0.0.1-SNAPSHOT.jar /usr/src/icecream/icecream.jar
WORKDIR /usr/src/icecream
CMD ["java", "-jar", "icecream.jar"]