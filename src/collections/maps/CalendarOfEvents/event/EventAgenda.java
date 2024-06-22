package collections.maps.CalendarOfEvents.event;

import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;

public class EventAgenda {
    private Map<LocalDate, Event> agenda = new TreeMap<>();

    public void addEvent(LocalDate date, String name, String attraction) {
        agenda.put(date, new Event(date, name, attraction));
    }

    public void displayAgenda() {
        agenda.forEach((date, event) -> System.out.println(event));
    }

    public Event getNextEvent() {
        return agenda.values().stream().findFirst().orElse(null);
    }

}
