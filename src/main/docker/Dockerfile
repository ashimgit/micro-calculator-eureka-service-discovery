FROM openjdk:8
VOLUME /tmp
ADD target/micro-calculator-eureka-service-discovery-0.0.1-SNAPSHOT.jar eurekaDiscoveryService.jar
RUN bash -c 'touch /eurekaDiscoveryService.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/eurekaDiscoveryService.jar"]