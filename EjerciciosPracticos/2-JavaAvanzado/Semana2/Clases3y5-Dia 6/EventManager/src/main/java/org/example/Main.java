package org.example;

import org.example.manager.EventManagerManager;

public class Main {
    public static void main(String[] args) {
        EventManagerManager eventManagerManager = new EventManagerManager();

        try{
            eventManagerManager.init();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}