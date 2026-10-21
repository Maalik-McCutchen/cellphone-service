package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {

        CellPhone cellPhoneApplication = new CellPhone();

        Scanner myScanner = new Scanner(System.in);

        System.out.println("What is the serial number?: ");
        int serialNumber = myScanner.nextInt();

        System.out.println("What model is the phone?: ");
        String model = myScanner.nextLine();

        System.out.println("Who is the carrier?: ");
        String carrier = myScanner.nextLine();

        System.out.println("What is the phone number?: ");
        String phoneNumber = myScanner.nextLine();

        System.out.println("Who is the owner of the phone?: ");
        String owner = myScanner.nextLine();
    }
}
