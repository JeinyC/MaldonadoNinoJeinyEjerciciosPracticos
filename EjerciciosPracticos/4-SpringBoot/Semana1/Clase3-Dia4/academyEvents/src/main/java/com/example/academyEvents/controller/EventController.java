package com.example.academyEvents.controller;

import com.example.academyEvents.model.Event;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class EventController {

    List<Event> events = Arrays.asList(
            new Event(1, "Introducción a la Programación en Java", "Aprende los conceptos básicos de la programación en Java.", "2024-01-25", "Aula 101", "Josep Martínez"),
            new Event(2, "Desarrollo Web con Spring Boot", "Explora cómo construir aplicaciones web con Spring Boot.", "2024-02-15", "Aula 102", "Anna Puig"),
            new Event(3, "Seguridad Informática: Principios y Prácticas", "Conoce las mejores prácticas en seguridad informática.", "2024-03-05", "Aula 103", "Xabier Etxebarria"),
            new Event(4, "Inteligencia Artificial y Aprendizaje Automático", "Descubre las últimas tendencias en inteligencia artificial.", "2024-04-20", "Aula 104", "Marta Casals"),
            new Event(5, "Desarrollo de Aplicaciones Móviles con Flutter", "Aprende a construir aplicaciones móviles multiplataforma con Flutter.", "2024-05-10", "Aula 105", "Aritz Iturrioz"),
            new Event(6, "Análisis de Datos con Python y Pandas", "Explora técnicas de análisis de datos utilizando Python y Pandas.", "2024-06-01", "Aula 106", "Joana Serra")
    );

    @GetMapping("/events")
    public String eventList() {
        return "Events - " + events.toString();
    }

    @GetMapping("/events/{id}")
    public String eventById(@PathVariable Integer id) {
        Event eventById = events.stream()
                .filter(evento -> evento.getId() == id)
                .findFirst()
                .orElse(null);

        if (eventById != null) {
            System.out.println("Evento encontrado: " + eventById);
        } else {
            System.out.println("Evento no encontrado con el ID: " + id);
        }
        return "Event -" + eventById;
    }

    @PostMapping("/events")
    public String crearProducto(@RequestBody Event newEvent) {
        return "Producto creado: " + newEvent.getTeacher();
    }
}
