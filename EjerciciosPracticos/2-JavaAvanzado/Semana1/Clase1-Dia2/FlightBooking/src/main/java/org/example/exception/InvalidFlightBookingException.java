package org.example.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InvalidFlightBookingException extends Exception {

    public InvalidFlightBookingException(String mensaje) {
        super(mensaje);
    }

    public InvalidFlightBookingException() {

    }

    public void validateData(String name, String destination, String inputDate, int numberSeat) throws InvalidFlightBookingException {
        if (name == null || name.isEmpty() || destination == null || destination.isEmpty()
                || inputDate == null || inputDate.isEmpty() || numberSeat <= 0 ){
            throw new InvalidFlightBookingException("The data entered is invalid or incomplete");
        }
    }

    public void validateSeats(int numberSeat) throws InvalidFlightBookingException {
         if (numberSeat > 20){
             throw new InvalidFlightBookingException("There are not enough seats available for reservation");
         }
    }

    public Date validateDate(String inputDate) throws InvalidFlightBookingException, ParseException {
        try {

        SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yyyy");
        Date date = sf.parse(inputDate);
        return date;
        } catch (ParseException e) {
            System.err.println("Incorrect date format. Please enter a valid date in dd-MM-yyyy format.");
        }
        return null;
    }
}
