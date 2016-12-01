import java.awt.Color
import java.awt.Graphics

/**
 * Created by missingdays on 01.12.16.
 */

abstract class Figure {
    var fillColor : Color = Color.white
    var borderColor : Color = Color.white

    var coordinate : Coordinate = Coordinate(0, 0)

    val g : Graphics

    constructor(g: Graphics){
        this.g = g
    }

    abstract fun draw()
}