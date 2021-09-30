FROM openjdk:11
COPY /target/CountryInfo-0.0.1-SNAPSHOT.jar /
EXPOSE 5000
WORKDIR /
ENTRYPOINT [ "java", "-jar", "CountryInfo-0.0.1-SNAPSHOT.jar" ]