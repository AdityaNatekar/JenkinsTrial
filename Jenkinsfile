pipeline {
    agent any
    
    stages {
        stage('Load and Use CommonUtils') {
            steps {
                script {
                    // Load CommonUtils.groovy from workspace
                    def commonUtils = load 'CommonUtils.groovy'
                    
                    // Use methods from CommonUtils inside script block
                    commonUtils.notify('Pipeline executed successfully!')
                    echo 'Hello World'
                }
            }
        }
    }
}

