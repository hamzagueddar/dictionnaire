pipeline {
    agent { docker { image 'maven:3.9.5' } }
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Run Tests') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                // Déployer votre application ici, par exemple, exécution d'un conteneur Docker
                // sh 'docker run -d -p 8080:8080 mon-application:latest'
            }
        }
    }
}
