import groovy.transform.Field

class Helper {
    transient def steps // Marking as transient to avoid serialization

    Helper(steps) {
        this.steps = steps
    }

    def printShellExecution(String command) {
        def result = steps.sh(script: command, returnStdout: true).trim()
        steps.echo "Shell command executed: ${command}"
        steps.echo "Result: ${result}"
        return result
    }
}
