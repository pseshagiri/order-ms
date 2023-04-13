FROM openjdk-jre-11-alpine
ADD ./target/orders-ms.jar app.jar
EXPOSE 9001:9001
ENTRYPOINT ["java","-jar","app.jar"]