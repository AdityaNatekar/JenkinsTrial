pipeline {
    agent any
    environment {
        GIT_REPO_URL = 'git@github.com:your-repo/your-project.git'
        GIT_BRANCH = 'main'
        GIT_CREDENTIALS_ID = 'your-ssh-credentials-id'
    }
    stages {
        stage('Initialize') {
            steps {
                script {
                    // Load the helper script
                    def helperScript = load "${WORKSPACE}/common.groovy"
                    
                    // Define a function to create helper instances with steps context
                    def getHelper = { stepsContext ->
                        return new helperScript.Helper(stepsContext)
                    }
                    
                    // Store the helper instance in the pipeline's context
                    helperInstance = getHelper(this)
                }
            }
        }
        // stage('Clone Repository') {
        //     steps {
        //         script {
        //             // Use the stored helper instance for operations
        //             helperInstance.gitClone(env.GIT_REPO_URL, env.GIT_BRANCH, env.GIT_CREDENTIALS_ID)
        //         }
        //     }
        // }
        stage('Build') {
            steps {
                script {
                    // Use the stored helper instance for operations
                    def shellCommand = "echo Hello, World!"
                    helperInstance.printShellExecution(shellCommand)
                }
            }
        }
    }
}
