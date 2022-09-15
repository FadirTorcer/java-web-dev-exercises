package org.launchcode.java.demos.exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {

    public static void main (String[] args) {

        ArrayList<Integer> myNumbers = new ArrayList<>();
        for (int j = 1; j <= 10; j++) myNumbers.add(j);
        //System.out.println(myNumbers);
        System.out.println("The total of the even numbers in the provided ArrayList is: " + sumEvens(myNumbers));

        String greenEggs = "I would not, could not, in a box. I would not, could not with a fox." +
                " I will not eat them in a house. I will not eat them with a mouse.";
        //replaceAll() method, remove each instance of POSIX character class \p{Punct}, punctuation characters
        String source = greenEggs.replaceAll("\\p{Punct}", "");
        //System.out.println(source);
        String[] strArr = source.split("\\s+");//Splitting using whitespace
        //System.out.println(Arrays.toString(strArr));
        ArrayList<String> myWords = new ArrayList<String>(Arrays.asList(strArr));
        fiveLetters(myWords);
    }

    public static Integer sumEvens (ArrayList<Integer> numbers) {

        Integer sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                sum += numbers.get(i);
            }
        }
        return sum;
    }

    public static void fiveLetters (ArrayList<String> words) {

        for (){};
    }
}
