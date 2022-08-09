FROM openjdk:8-jre-slim-bullseye

RUN /bin/cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && echo 'Asia/Shanghai' >/etc/timezone

# https://stackoverflow.com/questions/55454036/noclassdeffounderror-could-not-initialize-class-sun-awt-x11fontmanager
RUN apt-get update; apt-get install -y fontconfig libfreetype6

ADD ./target/ts-verification-code-service-1.0.jar /app/
CMD ["java", "-jar", "/app/ts-verification-code-service-1.0.jar"]

EXPOSE 15678
