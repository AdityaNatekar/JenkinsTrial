pipeline {
    agent any

    stages {
        stage('Initialize') {
            steps {
                script {
    
                }
            }
        }

        stage('Build') {
            steps {
                script {
                    def helperScript = load "${WORKSPACE}/common.groovy"
                    import Helper
                    def helper = new helperScript.Helper(this)
                    helper.printShellExecution('echo Hello, World!')
                }
            }
        }
    }
}
