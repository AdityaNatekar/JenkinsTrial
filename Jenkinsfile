// Jenkinsfile

pipeline {
    agent any
    
    stages {
        stage('Load and Use CommonUtils') {
            steps {
                script {
                    // Load CommonUtils.groovy and get its class definition
                    def utilsClass = load 'commonUtils.groovy'
                    
                    // Use static methods from CommonUtils class
                    utilsClass.cloneRepository('https://github.com/example/repo.git')
                    utilsClass.buildProject('mvn')
                    utilsClass.copyArtifacts('target/*.jar', '/tmp/artifacts/')
                    utilsClass.deploy('echo "Deploying..."')
                    utilsClass.notify('Pipeline executed successfully!')
                    
                    echo 'Hello World'
                }
            }
        }
    }
}
