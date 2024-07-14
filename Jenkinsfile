// Jenkinsfile

pipeline {
    agent any
    
    stages {
        stage('Load and Use CommonUtils') {
            steps {
                script {
                    // Load and use CommonUtils
                    def script = this
                    def utils = load script: 'CommonUtils.groovy'
                    
                    // Use methods from CommonUtils inside script block
                    utils.notify('Pipeline executed successfully!')
                    echo 'Hello World'
                }
            }
        }
    }
}
