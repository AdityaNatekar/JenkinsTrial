def helper

pipeline {
    agent any
    
    stages {
        stage('Initialize') {
            steps {
                script {
                    // Load Helper class from Helper.groovy
                    // load 'common.groovy'
                    
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


import groovy.transform.Field

class Helper {
    transient def steps // Marking as transient to avoid serialization

    Helper(steps) {
        this.steps = steps
    }

    def printShellExecution(String command) {
        def result = steps.sh(script: command, returnStdout: true).trim()
        steps.echo "Shell command executed: ${command}"
        steps.echo "Result: ${result}"
        return result
    }
}
