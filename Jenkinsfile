pipeline {
  agent any
  tools {
    maven '3.9.5'
    jdk '11'
  }
  stages {
    stage("getting code") {
      steps {
        git url: 'https://github.com/Malek-Zaag/TP4-Devops.git', branch: 'main',
          credentialsId: 'Github-creds'
        sh "ls -ltr"
        sh "java --version"
      }
    }
    stage("Building") {
      steps {
        script {
          echo "======== executing ========"
          sh "mvn test"
        }
      }
    }
  }
}