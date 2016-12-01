/**
 * Created by missingdays on 01.12.16.
 */

import java.awt.*
import java.awt.event.*

fun main(args: Array<String>){
    MainFrame()
}

class MainFrame : Frame {
    constructor() : super("JA visualizer"){
        setSize(400, 300)

        this.isVisible = true

        addWindowListener(DefaultWindowAdapter(this))
    }

    override fun paint(g : Graphics){
    }
}

