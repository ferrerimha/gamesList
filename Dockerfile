FROM maven:3.9.6-amazoncorretto-21 AS build
WORKDIR /app
COPY src ./src
COPY pom.xml .
RUN mvn clean package -DskipTests
FROM amazoncorretto:21-alpine-jdk
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 7786
ENTRYPOINT ["java", "-jar", "app.jar"]
