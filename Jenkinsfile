pipeline {
  agent {
    docker {
      image 'maven:3-alpine'
    }
  }
  stages {
    stage('Test') {
      steps {
        sh 'mvn test'
      }
    }
    stage('Package') {
      steps {
        sh 'mvn package'
      }
    }
  }
}
