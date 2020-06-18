FROM openjdk:14
VOLUME /tmp
EXPOSE 8010
ADD ./target/Springboot-servicio-zuul-server-0.0.1-SNAPSHOT.jar zuul-server.jar
ENTRYPOINT ["java","-jar","zuul-server.jar"]

