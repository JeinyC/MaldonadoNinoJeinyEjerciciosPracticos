package org.example.manager;
import org.example.exception.InvalidFlightBookingException;
import org.example.model.Flight;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class FlightManager {
    InvalidFlightBookingException invalidFlightBookingException = new InvalidFlightBookingException();

    public FlightManager() {
    }

    public void addFlightBooking() throws InvalidFlightBookingException, ParseException {


        Scanner sc = new Scanner(System.in);
        Flight flight = new Flight();

        System.out.println("Name :");
        flight.setName(sc.nextLine());
        System.out.println("Destination :");
        flight.setDestination(sc.nextLine());
        System.out.println("Date in format dd-MM-yyyy :");
        String inputDate = sc.nextLine();
        System.out.println("Number seat select from 1 to 20 :");
        flight.setNumberSeat(sc.nextInt());

        invalidFlightBookingException.validateData(flight.getName(), flight.getDestination(), inputDate, flight.getNumberSeat());
        invalidFlightBookingException.validateSeats(flight.getNumberSeat());
        flight.setDateTravel(invalidFlightBookingException.validateDate(inputDate));
    }
}
