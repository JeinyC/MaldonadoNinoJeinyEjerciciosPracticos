package org.example.model;

import java.time.LocalDate;

public class Event {

    /*Imagina que estás construyendo una aplicación para gestionar eventos en una agenda.
     Cada evento tiene un nombre, una fecha y una categoría (por ejemplo, "Reunión", "Conferencia", "Taller"). */

    private String name;
    private LocalDate date;
    private String category;

    public Event(String name, LocalDate date, String category) {
        this.name = name;
        this.date = date;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", category='" + category + '\'' +
                '}';
    }
}
