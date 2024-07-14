// CommonUtils.groovy

class CommonUtils {
    
    static void notify(String message) {
        // Example: Notify based on the message
        echo "Notification: ${message}"
    }
    
    static CommonUtils getInstance() {
        return new CommonUtils()
    }
    
    // Add more reusable methods as needed...
}
