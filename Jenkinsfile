pipeline {
  agent {
    docker {
      image 'openshift/jenkins-slave-maven-centos7'
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