pipeline {
    agent any

    triggers {
        githubPush()   // githubPush
    }

    tools {
        maven 'Maven' // Ensure Maven is configured in Jenkins global tool configuration
        jdk 'JAVA17'  // Ensure JDK is configured in Jenkins global tool configuration
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'master', url: 'https://github.com/Uwaisnagarro/Assignment6.git', credentialsId: '3eb0db10-6140-428f-ab00-adabc3d05a47'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Run') {
            steps {
                script {
                  bat 'java -jar target/Assignment6-0.0.1-SNAPSHOT.jar'
                  }
            }
        }
    }

    post {
        success {
            echo 'Pipeline succeeded!'
        }
        failure {
            echo 'Pipeline failed!'
        }
    }
}
