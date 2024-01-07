package org.example;

import org.example.manager.JuleVetManager;

public class Main {
    public static void main(String[] args) {

        JuleVetManager juleVetManager = new JuleVetManager();

        try {
            juleVetManager.init();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}