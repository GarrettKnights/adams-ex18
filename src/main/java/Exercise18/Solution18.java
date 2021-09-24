/*
 *  UCF COP3330 Fall 2021 Assignment 18 Solution
 *  Copyright 2021 Garrett Adams
 */


package Exercise18;

import java.util.Scanner;

public class Solution18 {
    public static void main(String[] args) {

        //Declares the variables that we will be using
        String CF;
        double C;
        double F;

        //Initializes the scanner
        Scanner ScanWord = new Scanner(System.in);

        //Asks user for input
        System.out.println("Press C to convert from Fahrenheit to Celsius. \nPress F to convert from Celsius to Fahrenheit.");
        //Scans input to CF
        CF = ScanWord.next();
        //Prints out the users choice
        System.out.println("Your choice: " + CF);
        //If enter C
        if (CF.equalsIgnoreCase("C" )) {

            //Asks user for input in Fahrenheit
            System.out.println("Please enter the temperature in Fahrenheit: ");
            //Scans input to F
            F = ScanWord.nextDouble();
            //Calculates Celsius
            C = (F - 32) * 5 / 9;
            //Prints out Celsius
            System.out.print("The temperature in Celsius is " + C);
        }
        //If enter F
        else if (CF.equalsIgnoreCase("F" )){
            //Asks user for input in Celsius
            System.out.println("Please enter the temperature in Celsius: ");
            //Scans input to C
            C = ScanWord.nextDouble();
            //Calculates the Fahrenheit
            F = (C * 9 / 5) + 32;
            //Prints out the Fahrenheit
            System.out.print("The temperature in Fahrenheit is " + F);
        }
        //If they enter a non-valid value
        else {
            System.out.print("Please enter either C or F");
        }
    }
}