package org.example;

import org.example.manager.Manager;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        try {
            manager.code();
        }catch (Exception e){
            System.out.println("Error " + e.getMessage());
        }
    }
}