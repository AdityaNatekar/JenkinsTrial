// Helper.groovy
import groovy.transform.Field

class Helper implements Serializable {
    @Field private static final long serialVersionUID = 1L
    @Field private def steps

    public Helper(steps) {
        this.steps = steps
    }

    public def printShellExecution(String command) {
        def result = steps.sh(script: command, returnStdout: true).trim()
        steps.echo "Shell command executed: ${command}"
        steps.echo "Result: ${result}"
        return result
    }
}

return this;
