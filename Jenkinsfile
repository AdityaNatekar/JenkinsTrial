def helper

pipeline {
    agent any
    
    stages {
        stage('Initialize') {
            steps {
                script {
                    // Load Helper class from Helper.groovy
                    load 'common.groovy'
                    
                    // Instantiate Helper class
                    helper = new Helper(steps)
                }
            }
        }
        stage('Example') {
            steps {
                script {
                    def result = helper.printShellExecution('echo "Hello World"')
                    echo "Returned result: ${result}"
                }
            }
        }
    }
}
