pipeline {
  agent any
  stages {
    stage("getting code") {
      steps {
        git url: 'https://github.com/Malek-Zaag/TP4-Devops.git', branch: 'main',
          credentialsId: 'Github-creds'
        sh "ls -ltr"
      }
    }
    stage("Building") {
      steps {
        script {
          echo "======== executing ========"
          sh "mvn clean package"
        }
      }
    }
  }
}