package org.example.manager;

import org.example.exception.StocktakingException;

import java.util.Scanner;

public class StocktakingManager {

    StocktakingException stocktakingException = new StocktakingException();

    public void addProduct() {

        Scanner scanner = new Scanner(System.in);

        boolean flag = true;


        while (flag) {
            try {
                System.out.println("Enter product details:");
                System.out.print("Name: ");
                String name = scanner.nextLine();

                System.out.print("Price: ");
                double price = Double.parseDouble(scanner.nextLine());

                System.out.print("Quantity: ");
                int quantity = Integer.parseInt(scanner.nextLine());

                stocktakingException.validateData(name, price, quantity);
                System.out.println("Product added successfully!");


                System.out.print("Do you want to add another product? (y/n): ");
                String choice = scanner.nextLine().toLowerCase();
                if (choice.equalsIgnoreCase("n")){
                    flag = false;
                }

            }catch (StocktakingException e){
                System.err.println(e.getMessage());
            }
        }
    }

}
