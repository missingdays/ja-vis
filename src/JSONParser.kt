
package ja.vis

import java.io.*
import java.util.*
import org.json.*

/**
 * Created by missingdays on 01.12.16.
 */


class JSONParser {
    val fileName : String
    val eventFile : EventFile

    constructor(fileName : String){
        this.fileName = fileName

        this.eventFile = parseFile()

        sortEvents()
    }

    private fun parseFile() : EventFile{

        val eventFile = EventFile()

        val scanner = Scanner(File(fileName))
        val jsonString = scanner.useDelimiter("\\A").next()
        scanner.close() // Put this call in a finally block

        val j = JSONObject(jsonString)

        val results = j.getJSONArray("data")

        for(any : Any in results){
            when(any){
                is JSONObject -> eventFile.addEvent(Event(any))
            }
        }

        return eventFile
    }

    private fun sortEvents(){
        Collections.sort(eventFile.events, {a, b ->
            if(a.tick < b.tick){
                -1
            } else if(a.tick > b.tick){
                1
            } else {
                0
            }
        })
    }
}