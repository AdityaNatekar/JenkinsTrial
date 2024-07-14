pipeline {
    agent any
    stages {
        stage('Initialize') {
            steps {
                script {
                    // Load fuji.groovy and kiku.groovy from the specified paths
                    def Fuji = load "${pwd()}/fuji.groovy"
                    def Kiku = load "${pwd()}/kiku.groovy"
                    
                    // Instantiate Fuji and Kiku classes
                    // def fujiInstance = new Fuji()
                    // def kikuInstance = new Kiku()
                    
                    // Assign instances to environment variables
                    env.fuji = Fuji
                    env.kiku = Kiku
                }
            }
        }
        stage('exec fuji') {
            steps {
                script {
                    // Call methods from Fuji instance
                    env.fuji.say()
                    env.fuji.sing("Lemon")
                }
            }
        }
        stage('exec kiku') {
            steps {
                script {
                    // Call methods from Kiku instance
                    env.kiku.say()
                }
            }
        }
    }
}
