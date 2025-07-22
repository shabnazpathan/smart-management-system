FROM openjdk:17
ADD target/SmartClinic-0.0.1-snapshot.jar
smartclinic.jar
ENTRYPOINT ["java", "-jar", "smartclinic.jar"]
