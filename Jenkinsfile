pipeline {
    agent any

    stages {
        stage('Initialize') {
            steps {
                script {
                    // Load Fuji and Kiku classes
                    def Fuji = load "${pwd()}/fuji.groovy"
                    def Kiku = load "${pwd()}/kiku.groovy"
                    
                    // Instantiate Fuji and Kiku objects
     
                    
   
                }
            }
        }

        stage('Execute Fuji') {
            steps {
                script {
                    // Access methods from Fuji instance
                   Fuji.say()
                   Fuji.sing("Lemon")
                }
            }
        }

        stage('Execute Kiku') {
            steps {
                script {
                    // Access methods from Kiku instance
                    Kiku.say()
                }
            }
        }
    }
}
