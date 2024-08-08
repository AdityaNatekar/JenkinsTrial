import groovy.json.JsonSlurper
import groovy.json.JsonOutput

class BuildManager {
    boolean forceBuild


    BuildManager(boolean forceBuild) {
        this.forceBuild = forceBuild

    }

    // Function to remove '#number' suffix from all component values
    // private Map removeNumberSuffixFromComponents(Map json) {
    //     if (json.containsKey('component')) {
    //         def updatedComponent = json.component.collect { componentList ->
    //             componentList.collect { component ->
    //                 def name = component[1]
    //                 if (name.contains('#')) {
    //                     // Remove '#number' from the component name
    //                     name = name.replaceAll(/#\d+$/, '')
    //                 }
    //                 [component[0], name]
    //             }
    //         }
    //         json.component = updatedComponent
    //     }
    //     return json
    // }

    // Function to decide whether to reuse all components based on the forceBuild flag
    Map buildJudgement() {
        if (forceBuild) {
            return true
        }
        return false
    }
}

// return new BuildManager()
