package org.lessons.java;

import java.util.Scanner;

public class TrainTicket {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Number of km:");
        int km = Integer.parseInt(scan.nextLine());
        System.out.println("Age:");
        int age = Integer.parseInt(scan.nextLine());
        scan.close();


       double price = km * 0.21;
        System.out.println("Original price:" + price);
       double newPrice = 0;
        if (age < 18){
            newPrice = price * 20 / 100;
        }

        if (age >= 65){
            newPrice = price * 20 / 100;
        }
        System.out.println("After discount:" + (price - newPrice));


    }
}
