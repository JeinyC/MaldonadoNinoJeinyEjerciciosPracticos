package org.example.manager;

import org.example.model.Agenda;

import java.time.LocalDate;
import java.util.*;

public class EventManagerManager {
    
    public void init() {

        List<Agenda> events = Arrays.asList(
                new Agenda("Team Meeting", LocalDate.of(2023, 12, 10), "Meeting"),
                new Agenda("Sales Conference", LocalDate.of(2023, 12, 10), "Conference"),
                new Agenda("Product presentation", LocalDate.of(2023, 12, 10), "Conference"),
                new Agenda("Interview", LocalDate.of(2023, 12, 22), "Meeting"),
                new Agenda("Development Workshop", LocalDate.of(2023, 12, 25), "Workshop"),
                new Agenda("Conferencia de Marketing", LocalDate.of(2023, 12, 28), "Conference"),
                new Agenda("Team Meeting", LocalDate.of(2024, 1, 2), "Meeting"),
                new Agenda("Innovation Workshop", LocalDate.of(2024, 1, 5), "Workshop")
        );

        List<Agenda> eventsForDate = events.stream()
                .filter(event -> event.getDate().equals(LocalDate.parse("2023-12-10")))
                .toList();
        System.out.println("Events that are scheduled for 2023-12-10");
        eventsForDate.forEach(System.out::println);
        System.out.println();

        List<Agenda> meetings = events.stream()
                .filter(p -> p.getCategory().equals("Meeting"))
                .toList();
        System.out.println(count(meetings) + " for the category Meeting");

        List<Agenda> conferences = events.stream()
                .filter(p -> p.getCategory().equals("Conference"))
                .toList();
        System.out.println(count(conferences) + " for the category Conference");

        List<Agenda> workshops = events.stream()
                .filter(p -> p.getCategory().equals("Workshop"))
                .toList();
        System.out.println(count(workshops) + " for the category Manager");
        System.out.println( );

        LocalDate today = LocalDate.now();

        Optional<Agenda> nearestEvent = events.stream()
                .min((event1, event2) -> {
                    LocalDate date1 = event1.getDate();
                    LocalDate date2 = event2.getDate();
                    return Math.abs(date1.until(today).getDays()) - Math.abs(date2.until(today).getDays());
                });

        nearestEvent.ifPresent(event -> System.out.println("The nearest event: " + event));
    }

    private String count(List<Agenda> list) {
        long count = list.size();
        return "There are " + count + " events";
    }
}

