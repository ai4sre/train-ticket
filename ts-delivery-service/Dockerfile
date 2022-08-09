FROM openjdk:8-jre-slim-bullseye

RUN /bin/cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && echo 'Asia/Shanghai' >/etc/timezone

ADD ./target/ts-delivery-service-1.0.jar /app/
CMD ["java", "-jar", "/app/ts-delivery-service-1.0.jar"]

EXPOSE 18856
