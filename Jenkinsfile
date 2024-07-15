pipeline {
    agent any
    environment {
        //GIT_REPO_URL = 'git@github.com:your-repo/your-project.git'
        //GIT_BRANCH = 'main'
        //GIT_CREDENTIALS_ID = 'your-ssh-credentials-id'
    }
    stages {
        stage('Initialize') {
            steps {
                script {
                    // Load the helper script once
                    def currentdir = pwd().toString()
                    def helperScript = load '${currentdir}/common.groovy'
                    // Define a function to create helper instances with steps context
                    getHelper = { stepsContext ->
                        new helperScript.Helper(stepsContext)
                    }
                }
            }
        }
        // stage('Clone Repository') {
        //     steps {
        //         script {
        //             // Create a helper instance with the current steps context
        //             def helper = getHelper(this)
        //             helper.gitClone(env.GIT_REPO_URL, env.GIT_BRANCH, env.GIT_CREDENTIALS_ID)
        //         }
        //     }
        // }
        stage('Build') {
            steps {
                script {
                    // Create a helper instance with the current steps context
                    def helper = getHelper(this)
                    def shellCommand = "echo Hello, World!"
                    helper.printShellExecution(shellCommand)
                }
            }
        }
    }
}
