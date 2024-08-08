import groovy.json.JsonSlurper
import groovy.json.JsonOutput

//import groovy.json.JsonSlurper
import utility.GroovyUtils

// Function to initialize BuildManager
def initializeBuildManager() {
    return GroovyUtils.loadGroovyScript('BuildManager.groovy')
}

// Function to parse a JSON string
def loadJsonFromString(jsonString) {
    def jsonSlurper = new JsonSlurper()
    return jsonSlurper.parseText(jsonString)
}

void main() {
checkout scm
    
            
    stage('init') {
        checkout scm
       def buildManager = initializeBuildManager()
//def buildManager = new BuildManager(params.FORCEBUILD.toBoolean(), builtJsonString)


        // Assume JSON strings are passed in as parameters
        String builtJsonString = params.BUILT_JSON
        
        // Create an instance of BuildManager
        Map built = buildManager.buildJudgement(params.FORCEBUILD, builtJsonString)

        // Get processed JSON based on the build judgement
      //  Map built = buildManager.buildJudgement()

        // Print JSON data for verification
        println "Built JSON: ${built}"
    }
}

node(params.EXECUTE_NODE) {
    timestamps {
        main()
    }
}
