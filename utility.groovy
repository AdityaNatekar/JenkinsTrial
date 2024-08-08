// File: utilities/GroovyUtils.groovy
package utility

import groovy.json.JsonSlurper
import groovy.json.JsonOutput
import groovy.util.DelegatingScript

class GroovyUtils implements Serializable {
    
    /**
     * Converts a JSON string to a Map.
     * @param jsonString The JSON string to convert.
     * @return The resulting Map.
     */
    static Map stringToMap(String jsonString) {
        try {
            def jsonSlurper = new JsonSlurper()
            return jsonSlurper.parseText(jsonString)
        } catch (Exception e) {
            throw new IllegalArgumentException("Failed to parse JSON string: ${e.message}", e)
        }
    }

    /**
     * Loads a Groovy script from a file.
     * @param filePath The path to the Groovy script file.
     * @return The loaded script.
     */
    static def loadGroovyScript(String filePath) {
        try {
            def script = new File(filePath).text
            def binding = new Binding()
            def shell = new GroovyShell(binding)
            return shell.evaluate(script)
        } catch (Exception e) {
            throw new RuntimeException("Failed to load Groovy script from file: ${filePath}", e)
        }
    }

    /**
     * Remove '#number' suffix from all component values in a Map.
     * @param json The Map to process.
     * @return The updated Map.
     */
    static Map removeNumberSuffixFromComponents(Map json) {
        if (json.containsKey('component')) {
            json.component = json.component.collect { componentList ->
                componentList.collect { component ->
                    def name = component[1]
                    if (name.contains('#')) {
                        // Remove '#number' from the component name
                        name = name.replaceAll(/#\d+$/, '')
                    }
                    [component[0], name]
                }
            }
        }
        return json
    }
}
