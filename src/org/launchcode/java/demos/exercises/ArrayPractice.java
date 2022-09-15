package org.launchcode.java.demos.exercises;

import java.util.Arrays;

public class ArrayPractice {

    public static void main (String[] args) {

        int[] practiceArray = {1, 1, 2, 3, 5, 8};
        System.out.println("Odd numbers in our array:");
        for (int number : practiceArray) {
            if (!(number % 2 == 0)) {
                System.out.print(number + " ");
                //if (Character.isDigit(number)) System.out.print(", ");
            }
        }
        System.out.println();

        String greenEggs = "I would not, could not, in a box. I would not, could not with a fox." +
                " I will not eat them in a house. I will not eat them with a mouse.";
        String[] eggWords = greenEggs.split("\\.");
        System.out.println(Arrays.toString(eggWords));

    }

}
