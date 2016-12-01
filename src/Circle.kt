
package ja.vis

import org.json.JSONObject
import java.awt.Graphics
import java.awt.Color

/**
 * Created by missingdays on 01.12.16.
 */

class Circle : Figure{
    var radius : Int = 0

    constructor() : super()

    override fun draw(g : Graphics){
        g.color = fillColor
        g.fillOval(coordinate.x, coordinate.y, radius, radius)

        g.color = borderColor
        g.drawOval(coordinate.x, coordinate.y, radius, radius)
    }
}

fun getCircleFromJSONObject(jo : JSONObject) : Circle{
    val circle = Circle()

    circle.fillColor = Color(jo.getInt("fillColor"))
    circle.borderColor = Color(jo.getInt("borderColor"))
    circle.radius = jo.getInt("radius")
    circle.coordinate = Coordinate(jo.getInt("x"), jo.getInt("y"))

    return circle
}