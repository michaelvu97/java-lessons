# syntax=docker/dockerfile:experimental
FROM openjdk:11 as base

COPY src /usr/src/myapp
WORKDIR /usr/src/myapp
RUN javac Main.java
ENTRYPOINT ["java", "Main"]

