import groovy.json.JsonSlurper
import groovy.json.JsonOutput

//import groovy.json.JsonSlurper

// Function to parse a JSON string
def loadJsonFromString(jsonString) {
    def jsonSlurper = new JsonSlurper()
    return jsonSlurper.parseText(jsonString)
}

void main() {
checkout scm
    load "BuildManager.groovy"
            
    stage('init') {
def buildManager = new BuildManager(params.FORCEBUILD.toBoolean(), builtJsonString)


        // Assume JSON strings are passed in as parameters
        String builtJsonString = params.BUILT_JSON
        
        // Create an instance of BuildManager
       // BuildManager buildManager = new BuildManager(params.FORCEBUILD.toBoolean(), builtJsonString)

        // Get processed JSON based on the build judgement
        Map built = buildManager.buildJudgement()

        // Print JSON data for verification
        println "Built JSON: ${built}"
    }
}

node(params.EXECUTE_NODE) {
    timestamps {
        main()
    }
}
