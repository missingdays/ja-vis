
package ja.vis

/**
 * Created by missingdays on 01.12.16.
 */

import org.json.*

class Event {
    val tick : Long
    val figure : Figure

    constructor(jsonObject : JSONObject){
        tick = jsonObject.getLong("tick")
        figure = getFigureFromJSONObject(jsonObject.getJSONObject("figure"))
    }

    constructor(tick : Long, figure : Figure){
        this.tick = tick
        this.figure = figure
    }
}