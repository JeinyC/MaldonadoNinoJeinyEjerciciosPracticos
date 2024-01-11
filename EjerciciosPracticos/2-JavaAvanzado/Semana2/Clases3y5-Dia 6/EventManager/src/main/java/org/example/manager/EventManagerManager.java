package org.example.manager;

import org.example.model.Event;

import java.time.LocalDate;
import java.util.*;

public class EventManagerManager {
    
    public void init() {

        List<Event> events = Arrays.asList(
                new Event("Team Meeting", LocalDate.of(2023, 12, 10), "Meeting"),
                new Event("Sales Conference", LocalDate.of(2023, 12, 10), "Conference"),
                new Event("Product presentation", LocalDate.of(2023, 12, 10), "Conference"),
                new Event("Interview", LocalDate.of(2023, 12, 22), "Meeting"),
                new Event("Development Workshop", LocalDate.of(2023, 12, 25), "Workshop"),
                new Event("Conferencia de Marketing", LocalDate.of(2023, 12, 28), "Conference"),
                new Event("Team Meeting", LocalDate.of(2024, 1, 2), "Meeting"),
                new Event("Innovation Workshop", LocalDate.of(2024, 1, 5), "Workshop")
        );

        List<Event> eventsForDate = events.stream()
                .filter(event -> event.getDate().equals(LocalDate.parse("2023-12-10")))
                .toList();
        System.out.println("Events that are scheduled for 2023-12-10");
        eventsForDate.forEach(System.out::println);
        System.out.println();

        List<Event> meetings = events.stream()
                .filter(p -> p.getCategory().equals("Meeting"))
                .toList();
        System.out.println(count(meetings) + " for the category Meeting");

        List<Event> conferences = events.stream()
                .filter(p -> p.getCategory().equals("Conference"))
                .toList();
        System.out.println(count(conferences) + " for the category Conference");

        List<Event> workshops = events.stream()
                .filter(p -> p.getCategory().equals("Workshop"))
                .toList();
        System.out.println(count(workshops) + " for the category Manager");
        System.out.println( );

        LocalDate today = LocalDate.now();

        Optional<Event> nearestEvent = events.stream()
                .filter(event -> event.getDate().isAfter(today))
                .min(Comparator.comparing(Event::getDate));
        nearestEvent.ifPresent(event -> System.out.println("The nearest event: " + event));
    }

    private String count(List<Event> list) {
        long count = list.size();
        return "There are " + count + " events";
    }
}

