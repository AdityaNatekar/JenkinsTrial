import groovy.json.JsonSlurper
import groovy.json.JsonOutput

class BuildManager {
    boolean forceBuild
    Map builtJson

    BuildManager(boolean forceBuild, String builtJsonString) {
        this.forceBuild = forceBuild
        this.builtJson = new JsonSlurper().parseText(builtJsonString)
    }

    // Function to remove '#number' suffix from all component values
    private Map removeNumberSuffix(Map json) {
        def updatedComponent = json.component.collect { componentList ->
            componentList.collect { component ->
                def name = component[1]
                if (name.contains('#')) {
                    // Remove '#number' from the component name
                    name = name.replaceAll(/#\d+$/, '')
                }
                [component[0], name]
            }
        }
        json.component = updatedComponent
        return json
    }

    // Function to decide whether to reuse all components based on the forceBuild flag
    Map buildJudgement() {
        if (forceBuild) {
            return removeNumberSuffix(builtJson)
        }
        return builtJson
    }
}





//import groovy.json.JsonSlurper

// Function to parse a JSON string
def loadJsonFromString(jsonString) {
    def jsonSlurper = new JsonSlurper()
    return jsonSlurper.parseText(jsonString)
}

void main() {
    stage('init') {


        // Assume JSON strings are passed in as parameters
        String builtJsonString = params.BUILT_JSON
        
        // Create an instance of BuildManager
        BuildManager buildManager = new BuildManager(params.FORCEBUILD.toBoolean(), builtJsonString)

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
