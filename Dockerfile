FROM openjdk:8-jre-alpine
ENV APP_FILE spring-boot-web-app.jar
ENV APP_HOME /app
COPY target/$APP_FILE $APP_HOME/
WORKDIR $APP_HOME
ENTRYPOINT ["sh", "-c"]
CMD ["exec java -jar $APP_FILE"]