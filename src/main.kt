
package ja.vis

/**
 * Created by missingdays on 01.12.16.
 */

import java.awt.*
import java.awt.event.*
import java.util.*

import javax.swing.Timer

fun main(args: Array<String>){

    val frame : MainFrame

    if(args.size == 0){
        println("No JSON file provided. Using example/simple.json")
        frame = MainFrame("example/simple.json")
    } else {
        frame = MainFrame(args[0])
    }

    val delay = 100

    val taskPerformer = {evt : ActionEvent ->
        frame.nextTick()
    }

    Timer(delay, taskPerformer).start()
}

class MainFrame : Frame {
    val j : JSONParser
    var currentTick : Long = 0
    var currentEvents : List<Event> = ArrayList()

    constructor(fileName : String) : super("JA visualizer"){
        setSize(800, 600)

        this.isVisible = true
        addWindowListener(DefaultWindowAdapter(this))

        j = JSONParser(fileName)
    }

    override fun paint(g : Graphics){

        if(j == null){
            return
        }

        g.clearRect(0, 0, width, height)

        for(e : Event in currentEvents){
            e.figure.draw(g)
        }
    }

    fun generateCurrentEvents() : List<Event>{
        return j.eventFile.events.filter {
            it.tick == currentTick
        }
    }

    fun nextTick(){
        if(j == null){
            return
        }

        currentTick++
        currentEvents = generateCurrentEvents()

        repaint()
    }
}