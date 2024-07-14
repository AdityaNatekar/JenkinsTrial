// Jenkinsfile

pipeline {
    agent any
    
    stages {
        stage('Load and Use CommonUtils') {
            steps {
                script {
                    // Load CommonUtils.groovy and invoke its static methods directly
                    fuji = load "${pwd()}/commonUtils.groovy"
                    
                    fuji.notify('Pipeline executed successfully!')
                    
                    echo 'Hello World'
                }
            }
        }
    }
}
