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
    stage("Static Code Analysis") {
      steps {
        echo "======== executing stage ========"

      }
    }
    stage("Notification email") {
      emailext (body: 'Pipeline Execution Success', subject: 'Build Success', to: 'zaag.malek1@gmail.com')
    }
  }
}