class Helper implements Serializable {

    static def printShellExecution(String command) {
        def result = sh(script: command, returnStdout: true).trim()
        echo "Shell command executed: ${command}"
        echo "Result: ${result}"
        return result
    }
}
