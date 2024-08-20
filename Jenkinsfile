@NonCPS
def loadJson(String str) {
    return parseObject(new groovy.json.JsonSlurper().parseText(str))
}

def processComponentList(List componentList) {
    println "componetlist: $componentList"
    def ignoreKeys = ['linux@RELEASE']
    return componentList.collect { component ->
        if (component instanceof List && component.size() == 2) {
            println "Inside Component $component"
            def jobVariant = component[0]
            def jobName = component[1]
            
            if (jobName instanceof String && jobName.contains('#') && !ignoreKeys.contains(jobVariant)) {
                println "jobName: $jobName"
                jobName = jobName.replaceAll(/#\d+$/, '')
            }
            [jobVariant, jobName]
        } else {
            println "Skipping component: $component"
            component
        }
    }
}

def processEntry(Object entry) {
    println "Processing map: $entry"
    if (entry instanceof Map) {
        println "Processing map: $entry"
        return entry.collectEntries { k, v ->
            println "Processing key-value pair: $k: $v"
            if (k == 'component') {
                [k, (v instanceof List) ? v.collect { processComponentList(it) } : processComponentList(v)]
            } else {
                [k, processEntry(v)]
            }
        }
    } else if (entry instanceof List) {
        println "Processing list: $entry"
        return entry.collect { processEntry(it) }
    } else {
        return entry
    }
}

def removeReuseSuffixFromComponents(Map json) {
    return processEntry(json)
}

Map buildJudgement(boolean forceBuild, Map builtJson) {
    if (forceBuild) {
        // Only modify the JSON if forceBuild is true
        return removeReuseSuffixFromComponents(builtJson)
    }
    // Return the original JSON if no modification is needed
    return builtJson
}

void main() {
    // def buildManager
    // checkout scm
    // def buildManagerScript = 'Fullbuild/BuildManager.groovy'
    // try {
    //     buildManager = load buildManagerScript
    // } catch (Exception exception) {
    //     error("Loading ${buildManagerScript} failed: ${exception}")
    // }

    Map built = buildJudgement(params.FORCEBUILD,loadJson(params.BUILT_JSON))
    print("built:$built")
}

node(params.EXECUTE_NODE) {
    timestamps {
        main()
    }
}
