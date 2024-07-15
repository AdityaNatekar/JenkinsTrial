class Helper implements Serializable {
    private static final long serialVersionUID = 1L
    private def steps

    public Helper(steps) {
        this.steps = steps
    }

    public def printShellExecution(String command) {
        def result = steps.sh(script: command, returnStdout: true).trim()
        steps.echo "Shell command executed: ${command}"
        steps.echo "Result: ${result}"
        return result
    }

    public def gitClone(String repoUrl, String branch, String credentialsId) {
        steps.sshagent(credentials: [credentialsId]) {
            steps.sh "git clone -b ${branch} ${repoUrl}"
        }
    }
}
