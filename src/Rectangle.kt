
import java.awt.Graphics

/**
 * Created by missingdays on 01.12.16.
 */

public class Rectangle : Figure{
    var size : Size = Size(0, 0)

    constructor(g : Graphics) : super(g){

    }

    override fun draw(){
        g.color = this.fillColor
        g.fillRect(coordinate.x, coordinate.y, size.width, size.height)

        g.color = this.borderColor
        g.drawRect(coordinate.x, coordinate.y, size.width, size.height)
    }
}