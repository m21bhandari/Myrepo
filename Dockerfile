FROM openjdk:17-slim
WORKDIR /app
EXPOSE 8080

ADD target/demopipe-0.0.1-SNAPSHOT.jar /app/demopipe-0.0.1-SNAPSHOT.jar

CMD ["java", "-jar", "/app/demopipe-0.0.1-SNAPSHOT.jar" ]

