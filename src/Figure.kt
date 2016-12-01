
package ja.vis

import java.awt.Color
import java.awt.Graphics

import org.json.*
/**
 * Created by missingdays on 01.12.16.
 */

abstract class Figure {
    var fillColor : Color = Color.white
    var borderColor : Color = Color.white

    var coordinate : Coordinate = Coordinate(0, 0)

    abstract fun draw(g : Graphics)
}

fun getFigureFromJSONObject(jo : JSONObject) : Figure{
    when(jo.getString("type")){
        "circle" -> return getCircleFromJSONObject(jo)
        "rectangle" -> return getRectangleFromJSONObject(jo)
    }

    throw Exception("Unknown figure type " + jo.getString("type"))
}