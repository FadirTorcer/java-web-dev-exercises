package org.launchcode.java.demos.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("This program finds the area of a circle. Please enter the radius: ");
        if(input.hasNextDouble()) {
            double radius = input.nextDouble();
            double area = Circle.getArea(radius);
            System.out.println("The area of the circle is : " + area);
        }
        //double radius = input.nextDouble();
        //if (radius < 0) {
        //    System.out.println("You entered a negative number. There are no circles with negative radii.");
        //} else if () {

        //}
        input.close();


    }
}
