// CommonUtils.groovy

class CommonUtils {
    
    static void cloneRepository(String repoUrl) {
        // Clean workspace before cloning (optional)
        deleteDir()
        
        // Clone the repository
        git url: repoUrl
    }
    
    static void buildProject(String buildTool) {
        // Example: buildTool could be 'mvn', 'gradle', etc.
        sh "${buildTool} clean package"
    }
    
    static void copyArtifacts(String sourcePattern, String destinationPath) {
        // Example: Copy artifacts from sourcePattern to destinationPath
        sh "cp ${sourcePattern} ${destinationPath}"
    }
    
    static void deploy(String deployCommand) {
        // Example: Execute deployment commands
        sh deployCommand
    }
    
    static void notify(String message) {
        // Example: Notify based on the message
        echo "Notification: ${message}"
    }
    
    // Add more reusable methods as needed...
    
}
