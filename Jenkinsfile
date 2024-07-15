pipeline {
    agent any

    stages {
        stage('Example') {
            steps {
                script {
                    // Load Helper class from workspace
                    def helperScript = load "${workspace}/common.groovy"

                    // Instantiate Helper class
                    def helper = new helperScript.Helper(steps)

                    // Use helper method
                    helper.printShellExecution('echo "Hello, world!"')
                }
            }
        }
    }
}
