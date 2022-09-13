package org.launchcode.java.demos.exercises;

import java.util.Scanner;

public class NewHello {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hello, what is your name:");
        String name = input.nextLine();
        input.close();

        System.out.println("Hello, " + name);
    }
}
