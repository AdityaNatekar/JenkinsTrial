pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                def commonUtils = load 'CommonUtils.groovy'
                commonUtils.notify('Pipeline executed successfully!')
                echo 'Hello World'
            }
        }
    }
}
