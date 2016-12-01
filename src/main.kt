/**
 * Created by missingdays on 01.12.16.
 */

package ja.vis

import java.awt.*
import java.awt.event.*

import ja.vis.DefaultWindowAdapter

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
        g.fillRect(50, 50, 200, 200)

        g.color = Color.blue
        g.drawRect(50, 50, 200, 200)
    }
}

