pipeline {

    agent any
 
    stages {

        stage('Build') {

            steps {

                echo 'Building in june..'

            }

        }

        stage('Test') {

            steps {

                echo 'Testing in June..'

            }

        }

        stage('Deploy') {

            steps {

                echo 'Deploying in June....'

            }

        }

    }

}