package org.example;

import org.example.manager.CarDealerManager;

public class Main {
    public static void main(String[] args) {

        CarDealerManager carDealerManager = new CarDealerManager();
        try {
            carDealerManager.init();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}