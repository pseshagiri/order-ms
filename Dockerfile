FROM openjdk:17-alpine
ADD ./target/orders-ms.jar app.jar
EXPOSE 9001:9001
ENTRYPOINT ["java","-jar","app.jar"]