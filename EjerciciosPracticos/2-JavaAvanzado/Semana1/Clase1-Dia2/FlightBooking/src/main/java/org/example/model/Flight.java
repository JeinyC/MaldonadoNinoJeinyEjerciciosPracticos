package org.example.model;
import java.util.Date;

public class Flight {

    private String name;
    private String destination;
    private Date dateTravel;
    private int numberSeat;

    public Flight(String name, String destination, Date dateTravel, int numberSeat) {
        this.name = name;
        this.destination = destination;
        this.dateTravel = dateTravel;
        this.numberSeat = numberSeat;
    }

    public Flight() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getDateTravel() {
        return dateTravel;
    }

    public void setDateTravel(Date dateTravel) {
        this.dateTravel = dateTravel;
    }

    public int getNumberSeat() {
        return numberSeat;
    }

    public void setNumberSeat(int numberSeat) {
        this.numberSeat = numberSeat;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "name='" + name + '\'' +
                ", destination='" + destination + '\'' +
                ", dateTravel=" + dateTravel +
                ", numberSeat=" + numberSeat +
                '}';
    }
}

