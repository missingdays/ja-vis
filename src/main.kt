
package ja.vis

/**
 * Created by missingdays on 01.12.16.
 */

import java.awt.*
import java.awt.event.*

fun main(args: Array<String>){

    if(args.size == 0){
        println("No JSON file provided. Using example/simple.json")
        MainFrame("example/simple.json")
        return
    }

    MainFrame(args[0])
}

class MainFrame : Frame {
    val j : JSONParser

    constructor(fileName : String) : super("JA visualizer"){
        setSize(400, 300)
        this.isVisible = true
        addWindowListener(DefaultWindowAdapter(this))

        j = JSONParser(fileName)
    }

    override fun paint(g : Graphics){
        if(j == null){
            return
        }

        for(e : Event in j.eventFile.events){
            e.figure.draw(g)
        }
    }
}