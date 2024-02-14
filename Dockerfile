FROM openjdk:17

COPY target/MyLearning_docker_file.jar /usr/app/

WORKDIR /usr/app

ENTRYPOINT ["java","-jar","MyLearning_docker_file.jar"]