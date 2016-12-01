import java.awt.Color
import java.awt.Graphics

/**
 * Created by missingdays on 01.12.16.
 */

abstract class Figure {
    var fillColor : Color = Color.white
    var borderColor : Color = Color.white

    var size : Size = Size(0, 0)
    var coordinate : Coordinate = Coordinate(0, 0)

    var g : Graphics? = null

    constructor(g: Graphics){
        this.g = g
    }

    abstract fun draw()
}