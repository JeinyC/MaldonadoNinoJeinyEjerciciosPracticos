package org.example.manager;

import java.util.Scanner;

public class Manager {
    public void code() {

        Scanner sc = new Scanner(System.in);
        int index;

        System.out.println("Choose Index 0-4");
        index = sc.nextInt();

        try {
            int i = myVector()[index];
            System.out.println("Index : " + index + " Number : " + myVector()[index]);
        }catch (IndexOutOfBoundsException e){
            System.err.println("Error accessing data: Attempted to access an invalid index");
        }
    }

    public int[] myVector() {
        return new int[]{1, 2, 3, 4, 5};
    }
}
