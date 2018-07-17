FROM maven:3.5.4-jdk-8 as build
COPY . /app
WORKDIR /app
ENV JAVA_OPTS -Xms256m -Xmx768m
ENV MAVEN_OPTS -Xms256m -Xmx768m 
RUN ["mvn", "clean", "package"]

FROM tomcat:8.0.20-jre8 as service 
COPY --from=build /app/target/PlacesAPI.war /usr/local/tomcat/webapps/PlacesAPI.war
