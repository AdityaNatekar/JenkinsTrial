def helper = new Helper(steps)

pipeline {
    agent any
    
    stages {
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

class Helper implements Serializable {
    private static final long serialVersionUID = 1L

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
