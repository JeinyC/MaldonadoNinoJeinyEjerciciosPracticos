package org.example.manager;

import org.example.exception.StocktakingException;
import org.example.model.Product;

import java.util.Scanner;

public class StocktakingManager {

    StocktakingException stocktakingException = new StocktakingException();

    public void addProduct() {

        Scanner scanner = new Scanner(System.in);
        Product product = new Product();

            try {
                System.out.println("Enter product details:");
                System.out.print("Name: ");
                product.setName(scanner.nextLine());


                System.out.print("Price: ");
                product.setPrice(scanner.nextDouble());

                System.out.print("Quantity: ");
               product.setQuantity(scanner.nextInt());

                stocktakingException.validateData(product.getName(), product.getPrice(), product.getQuantity());
                System.out.println("Product added successfully!");

            }catch (StocktakingException e){
                System.err.println(e.getMessage());
            }
        }
    }


