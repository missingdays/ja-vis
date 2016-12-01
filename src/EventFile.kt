
package ja.vis

import java.util.*

/**
 * Created by missingdays on 01.12.16.
 */
class EventFile {
    val events : MutableList<Event> = mutableListOf<Event>()

    fun addEvent(e : Event){
        events.add(e)
    }

    // Stupid slow implementation
    fun getEventsOfTick(tick : Long) : MutableList<Event> {
        val tickEvents : MutableList<Event> = mutableListOf<Event>()

        for(event : Event in events){
            if(event.tick == tick){
                tickEvents.add(event)
            }
        }

        return tickEvents
    }
}