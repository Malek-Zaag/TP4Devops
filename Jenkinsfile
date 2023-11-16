pipeline {
  agent any
  tools {
    maven '3.9.5'
  }
  stages {
    stage("getting code") {
      steps {
        echo "======== executing stage ========"
        git url: 'https://github.com/Malek-Zaag/TP4-Devops.git', branch: 'main',
          credentialsId: 'Github-creds'
        sh "ls -ltr"
        sh "java --version"
      }
    }
    stage("Building the application") {
      steps {
        script {
          echo "======== executing stage ========"
          sh "mvn clean install -Dmaven.test.skip=true"
        }
      }
    }
    stage("Running Unit tests") {
      steps {
        script {
          echo "======== executing stage ========"
          sh "mvn test -Dtest=StudentServiceTest"
          junit allowEmptyResults: true, testResults: '**/test-results/report.xml'
        }
      }
    }
    stage("Static Code Analysis") {
      steps {
        echo "======== executing stage ========"
      }
    }
  }
  post {
    success {
      mail bcc: '', body: 'Pipeline build success', cc: '', from: 'zaag.malek@gmail.com', replyTo: '', subject: 'Pipeline build success', to: 'zaag.malek1@gmail.com'
    }
  }

}