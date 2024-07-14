pipeline {
    agent any
    
    stages {
        stage('Load and Use CommonUtils') {
            steps {
                script {
                    // Load CommonUtils class
                    def commonUtils = new CommonUtils()
                    
                    // Use methods from CommonUtils inside script block
                    commonUtils.notify('Pipeline executed successfully!')
                    echo 'Hello World'
                }
            }
        }
    }
}
