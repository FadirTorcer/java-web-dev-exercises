package org.launchcode.java.demos.exercises;

import java.util.Scanner;

public class MilesPerGallon {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles did you drive today? ");
        double miles = input.nextDouble();
        System.out.println("How many gallons of gasoline did you use today? ");
        double gallons = input.nextDouble();
        input.close();

        double milesPerGallon = (double) Math.round((miles / gallons)*100) / 100;
        System.out.println("Your fuel efficiency today was " + milesPerGallon + " miles per gallon.");
    }
}
