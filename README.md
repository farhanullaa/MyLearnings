# Git hub commands:
1. Create a new repository on GitHub. 
2. Right-click on the project and choose ‘Show in Local Terminal’ - Git Bash
3. Initialize the local directory as a Git repository.
$ git init
4. Add the files in your new local repository. This stages them for the first commit.
$ git add .
Adds the files in the local repository and stages them for commit.
5. Commit the files that you've staged in your local repository.
$ git commit -m "First commit"
Commits the tracked changes and prepares them to be pushed to a remote repository. 
6. In the Command prompt, add the remote repository url copy from Github
$ git remote add origin (remote-repository)
$ git remote -v
Verifies the new remote URL
7. Push the changes in your local repository to GitHub.
$ git push origin master
8. To create a new brach
$ git branch <New branch name>

# Deploy spring boot app with docker
1. Create Spring boot App
2. Package Boot using "mvn clean package"
3. write Dockerfile to build docker image
- check the docker image -> "docker images"
- create a docker image -> "docker build -t <ImageName> ."
4. create Docker Image using Dockerfile
"FROM openjdk:17
COPY target/MyLearning_docker_file.jar /usr/app/
WORKDIR /usr/app
ENTRYPOINT ["java","-jar","MyLearning_docker_file.jar"]"
5. Run Docker image
- "docker run -d -p 8080:8080 <ImageName>"
   
