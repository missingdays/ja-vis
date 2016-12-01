/**
 * Created by missingdays on 01.12.16.
 */

package ja.vis

import java.awt.*
import java.awt.event.*

fun main(args: Array<String>){
    Example()
}

class Example : Frame {
    constructor() : super("JA visualizer"){
        setSize(400, 300)

        this.isVisible = true

        addWindowListener(DefaultWindowAdapter(this))
    }

    override fun paint(g : Graphics){
        g.color = Color.red
        g.drawRect(50, 50, 200, 200)

        g.color = Color.blue
        g.drawRect(75, 75, 300, 200)
    }
}

class DefaultWindowAdapter : WindowAdapter {
    var frame : Frame? = null
    constructor(frame : Frame): super(){
        this.frame = frame
    }

    override fun windowClosing(e : WindowEvent){
        frame?.dispose()

        System.exit(0)
    }
}