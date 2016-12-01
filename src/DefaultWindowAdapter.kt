/**
 * Created by missingdays on 01.12.16.
 */

import java.awt.*
import java.awt.event.*

class DefaultWindowAdapter : WindowAdapter {

    var frame : Frame? = null

    constructor(f : Frame){
        frame = f
    }

    override fun windowClosing(e : WindowEvent){
        frame?.dispose()
        System.exit(0)
    }
}