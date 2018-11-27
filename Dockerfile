FROM alpine
RUN apk --update add openjdk8-jre
VOLUME [ "/tmp" ]
COPY /target/sam-k8s-springboot.jar app.jar
EXPOSE 8080
CMD ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]