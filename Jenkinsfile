pipeline {
    agent any

    stages {
        stage('Example Stage') {
            steps {
                script {
                    // Load the CommonUtils class
                    def CommonUtils = load "common.groovy"

                    // Instantiate an object of CommonUtils
                    def utils = new CommonUtils()

                    // Call the method from CommonUtils
                    utils.myCommonCode()
                }
            }
        }
    }
}
