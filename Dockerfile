# You can change this base image to anything else
# But make sure to use the correct version of Java
FROM adoptopenjdk/openjdk11:alpine-jre

# Simply the artifact path
ARG artifact=target/calc.war

COPY ${artifact} calc.war

# This should not be changed
ENTRYPOINT ["java","-jar","app.jar"]
