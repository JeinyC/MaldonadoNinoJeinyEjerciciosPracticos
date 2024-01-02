package org.example;

import org.example.manager.StocktakingManager;

public class Main {
    public static void main(String[] args) {
        StocktakingManager stocktakingManager = new StocktakingManager();
        try {
            stocktakingManager.addProduct();
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}