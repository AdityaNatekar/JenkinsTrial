pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                script {
                    def helperScript = load "${WORKSPACE}/common.groovy"
                
                    //def helper = new helperScript.Helper(this)
                    helperScript.printShellExecution('echo Hello, World!')
                }
            }
        }
    }
}
