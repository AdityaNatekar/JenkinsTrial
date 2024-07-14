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
                    def fujiInstance = new Fuji()
                    def kikuInstance = new Kiku()
                    
                    // Store instances in environment for use in subsequent stages
                    env.fujiInstance = fujiInstance
                    env.kikuInstance = kikuInstance
                }
            }
        }

        stage('Execute Fuji') {
            steps {
                script {
                    // Access methods from Fuji instance
                    env.fujiInstance.say()
                    env.fujiInstance.sing("Lemon")
                }
            }
        }

        stage('Execute Kiku') {
            steps {
                script {
                    // Access methods from Kiku instance
                    env.kikuInstance.say()
                }
            }
        }
    }
}
