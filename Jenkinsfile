pipeline {
    agent any

    stages {
        stage('Initialize') {
            steps {
                script {
                    // Load Groovy classes
                    def Fuji = load "fuji.groovy"
                    def Kiku = load "kiku.groovy"
                    
                    // Instantiate objects
                    def fujiInstance = new Fuji()
                    def kikuInstance = new Kiku()
                    
                    // Use methods from Fuji and Kiku instances
                    fujiInstance.say()
                    fujiInstance.sing("Lemon")
                    kikuInstance.say()
                }
            }
        }
    }
}
