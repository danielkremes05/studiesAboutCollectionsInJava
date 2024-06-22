package collections.maps.CalendarOfEvents.event;

import java.time.LocalDate;

public class Event {
    private LocalDate date;
    private String name;
    private String attraction;

    public Event (LocalDate date, String name, String attraction) {
        this.date = date;
        this.name = name;
        this.attraction = attraction;
    }

    public LocalDate getDate () {
        return date;
    }

    public String getName () {
        return name;
    }

    public String getAttraction () {
        return attraction;
    }

    @Override
    public String toString () {
        return "Event{" +
                "date=" + date +
                ", name='" + name + '\'' +
                ", attraction='" + attraction + '\'' +
                '}';
    }
}
