FROM openjdk:17-jdk-slim AS build
COPY . /app
WORKDIR /app
RUN /app/mvnw package -DskipTests

FROM openjdk:17-jdk-slim

COPY --from=build /app/target/todo-0.0.1-SNAPSHOT.jar /app.jar

ENTRYPOINT ["java","-jar","/app.jar"]