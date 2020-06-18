FROM openjdk:14
VOLUME /tmp
EXPOSE 8888
ADD ./target/Springboot-servicio.confing-server-0.0.1-SNAPSHOT.jar confing-server.jar
ENTRYPOINT ["java","-jar","confing-server.jar"]