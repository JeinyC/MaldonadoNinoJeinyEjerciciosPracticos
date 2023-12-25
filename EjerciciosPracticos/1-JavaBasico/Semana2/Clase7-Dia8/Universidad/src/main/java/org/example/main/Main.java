package org.example.main;

import org.example.manager.Manager;

public class Main {
    public static void main(String[] args) {

        Manager manager;

        try {
            manager = new Manager();
            manager.menu();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}