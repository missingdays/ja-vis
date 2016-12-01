import java.awt.Graphics

/**
 * Created by missingdays on 01.12.16.
 */

class Circle : Figure{
    var radius : Int = 0

    constructor(g : Graphics) : super(g)

    override fun draw(){
        g.color = fillColor
        g.drawOval(coordinate.x, coordinate.y, radius, radius)

        g.color = borderColor
        g.drawOval(coordinate.x, coordinate.y, radius, radius)
    }
}