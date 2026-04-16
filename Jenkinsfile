pipeline {
    agent any

    environment {
        DOCKER_IMAGE = "jordan0638/app:latest"
    }

    stages {

        stage('Clone') {
            steps {
                git branch: 'main',
                url: 'https://github.com/Jordan0638/FAT.git'
            }
        }

        stage('Build & Test') {
            steps {
                bat 'mvn clean package'
            }
        }

        stage('Build Docker Image') {
            steps {
                bat "docker build -t %DOCKER_IMAGE% ."
            }
        }

        stage('Push to DockerHub') {
            steps {
                bat "docker push %DOCKER_IMAGE%"
            }
        }
    }
}