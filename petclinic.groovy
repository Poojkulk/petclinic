pipeline {
    agent any

    stages {
        stage('cloning repo ... ') {
            steps {
                git 'https://github.com/Poojkulk/Bamboo-spec.git'
            }
        }
         triggers {
        scm('H/5 * * * *')
    }
    steps {
        maven('-e clean test')
    }
    }
      
}


