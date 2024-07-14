pipeline {
    agent any

    stages {
        stage('Initialize') {
            steps {
                script {
                    // Load Groovy classes
                    def Fuji = load "fuji.groovy"
              
                    
                    // Instantiate objects
                    def fujiInstance = new Fuji()
                
                    
                    // Use methods from Fuji and Kiku instances
                    fujiInstance.say()
                    fujiInstance.sing("Lemon")

                }
            }
        }
    }
}
