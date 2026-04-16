pipeline {
    agent any

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

        stage('Docker Build') {
            steps {
                bat 'docker build -t myapp .'
            }
        }

        stage('Run') {
            steps {
                bat 'docker run -d -p 8081:8080 myapp'
            }
        }
    }
}