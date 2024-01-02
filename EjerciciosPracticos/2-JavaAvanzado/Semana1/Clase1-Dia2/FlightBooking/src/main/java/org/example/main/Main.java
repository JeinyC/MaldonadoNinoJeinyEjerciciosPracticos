package org.example.main;

import org.example.exception.InvalidFlightBookingException;
import org.example.manager.FlightManager;

import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        FlightManager flightServices = new FlightManager();
        int opcion;

        try {
            do {
                System.out.println("----- Menú -----");
                System.out.println("1. Book flight");
                System.out.println("0. Salir");
                System.out.print("Ingrese su opción: ");
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        flightServices.addFlightBooking();
                        break;
                    case 0:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción inválida, por favor ingrese una opción válida.");
                        break;
                }
            } while (opcion != 0);
        } catch (InvalidFlightBookingException e) {
            System.err.println(e.getMessage());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}