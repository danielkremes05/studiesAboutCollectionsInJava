package collections.maps.CalendarOfEvents.main;

import collections.maps.CalendarOfEvents.event.EventAgenda;

import java.time.LocalDate;

public class Main {
    public static void main (String[] args) {
        EventAgenda eventAgenda = new EventAgenda();

        eventAgenda.addEvent(LocalDate.of(2024, 7, 15), "Concert", "The Rolling Stones");
        eventAgenda.addEvent(LocalDate.of(2024, 6, 21), "Festival", "Summer Fest");
        eventAgenda.addEvent(LocalDate.of(2024, 8, 5), "Conference", "Tech Conference 2024");

        System.out.println("Events Agenda:");
        eventAgenda.displayAgenda();

        System.out.println("\nNext Event:");
        System.out.println(eventAgenda.getNextEvent());
    }
}
