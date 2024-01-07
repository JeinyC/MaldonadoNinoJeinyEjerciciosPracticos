package org.example;

import org.example.manager.EmployeeManager;

public class Main {

    public static void main(String[] args) {

        EmployeeManager empleadoManager = new EmployeeManager();

        try{
            empleadoManager.init();
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}