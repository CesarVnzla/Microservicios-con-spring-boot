FROM openjdk:14
VOLUME /tmp
EXPOSE 9100
ADD ./target/Springboot-servicio-oauth-0.0.1-SNAPSHOT.jar servicio-oauth.jar
ENTRYPOINT ["java","-jar","servicio-oauth.jar"]
