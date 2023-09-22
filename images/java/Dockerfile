FROM adoptopenjdk/openjdk11
ENV JAVA_OPTS=""

ADD hotelhub-0.0.1-SNAPSHOT.jar app.jar
 # use a volume is mor efficient and speed that filesystem
VOLUME /tmp
EXPOSE 8080
#-Dspring.profiles.active=test
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -jar /app.jar" ]
