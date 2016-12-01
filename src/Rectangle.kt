
package ja.vis

import org.json.JSONObject
import java.awt.Color
import java.awt.Graphics

/**
 * Created by missingdays on 01.12.16.
 */

public class Rectangle : Figure{
    var size : Size = Size(0, 0)

    constructor() : super(){
    }

    override fun draw(g : Graphics){
        g.color = this.fillColor
        g.fillRect(coordinate.x, coordinate.y, size.width, size.height)

        g.color = this.borderColor
        g.drawRect(coordinate.x, coordinate.y, size.width, size.height)
    }
}

fun getRectangleFromJSONObject(jo : JSONObject) : Rectangle{
    val rectangle = Rectangle()

    rectangle.fillColor = Color(jo.getInt("fillColor"))
    rectangle.borderColor = Color(jo.getInt("borderColor"))
    rectangle.size = Size(jo.getInt("width"), jo.getInt("height"))
    rectangle.coordinate = Coordinate(jo.getInt("x"), jo.getInt("y"))

    return rectangle
}