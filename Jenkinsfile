import groovy.json.JsonSlurper

// Function to parse a JSON string
def loadJsonFromString(jsonString) {
    def jsonSlurper = new JsonSlurper()
    return jsonSlurper.parseText(jsonString)
}

void main() {
    stage('init') {

        
        // Assume JSON strings are passed in as parameters
        String builtJsonString = params.BUILT_JSON
        String jobsJsonString = params.JOBS_JSON
        String variantsJsonString = params.VARIANTS_JSON
        
        // Load JSON data from strings
        Map built = loadJsonFromString(builtJsonString)
        Map jobs = loadJsonFromString(jobsJsonString)
        Map variants = loadJsonFromString(variantsJsonString)
        
        // Print JSON data for verification
        println "Built JSON: ${built}"
        println "Jobs JSON: ${jobs}"
        println "Variants JSON: ${variants}"
    }
}

node(params.EXECUTE_NODE) {
    timestamps {
        main()
    }
}
