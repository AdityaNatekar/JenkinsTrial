// Jenkinsfile

pipeline {
    agent any
    
    stages {
        stage('Load and Use CommonUtils') {
            steps {
                script {
                    // Load and use CommonUtils
                    load 'CommonUtils.groovy'
                    
                    // Instantiate CommonUtils class
                    def commonUtils = new CommonUtils()
                    
                    // Use methods from CommonUtils inside script block
                    commonUtils.notify('Pipeline executed successfully!')
                    echo 'Hello World'
                }
            }
        }
    }
}
