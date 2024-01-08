package org.example;
import org.example.manager.DirectoryManager;

public class Main {
    public static void main(String[] args) {

        DirectoryManager directoryManager = new DirectoryManager();

        try {
            directoryManager.init();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}