FROM openjdk:17-jdk-slim

RUN apt update && apt install -y maven

WORKDIR /app

COPY ./src /app/src
COPY ./test /app/test
COPY ./mvnw /app/mvnw
COPY ./mvnw.cmd /app/mvnw.cmd
COPY ./pom.xml /app/pom.xml

CMD ["mvn", "clean", "package"]