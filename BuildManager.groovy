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
    private Map removeNumberSuffixFromComponents(Map json) {
        if (json.containsKey('component')) {
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
        }
        return json
    }

    // Function to decide whether to reuse all components based on the forceBuild flag
    Map buildJudgement() {
        if (forceBuild) {
            return removeNumberSuffixFromComponents(builtJson)
        }
        return builtJson
    }
}

return new BuildManager()
