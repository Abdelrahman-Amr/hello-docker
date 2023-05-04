#    From maven:3-openjdk-17-slim As Build
#    COPY src /home/app/
#    COPY pom.xml /home/app/pom2.xml
#    WORKDIR  /home/app/
#    RUN mvn -f pom2.xml  clean package


    From openjdk:17-alpine As Run
    ARG msg=default_msg
    ARG port=8080
    ENV msg=${msg}
    ENV myPort=${port}
#    COPY --from=Build /home/app/target/*.jar /usr/local/lib/hello-docker/service.jar
    COPY /target/*.jar /usr/local/lib/hello-docker/service.jar

    WORKDIR /usr/local/lib/hello-docker
    EXPOSE $myPort
    ENTRYPOINT ["java", "-jar", "service.jar"]
