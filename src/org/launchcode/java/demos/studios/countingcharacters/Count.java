package org.launchcode.java.demos.studios.countingcharacters;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Count {

    public static void main (String[] args) {

/*        try {
            File myObj = new File("filename.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }*/

        String hiddenFigures = "If the product of two terms is zero then common sense says at least one of the two" +
                " terms has to be zero to start with. So if you move all the terms over to one side, you can put the" +
                " quadratics into a form that can be factored allowing that side of the equation to equal zero." +
                " Once you’ve done that, it’s pretty straightforward from there.";
        //Scanner input = new Scanner(System.in);
        //System.out.println("Enter a string for which you want the characters counted: ");
        //String userString = input.nextLine();
        //input.close();
        String small = hiddenFigures.toLowerCase();
        String noPunctuation = small.replaceAll("\\p{Punct}", "");
        String noSpaces = noPunctuation.replaceAll(" ", "");
        String justLetters = noSpaces.replaceAll("[01234567890]", "");
        //testString3.replaceAll("[^a-zA-Z]", "");

        char[] charactersInString = justLetters.toCharArray();
        HashMap<Character, Integer> characters = new HashMap<>();
        for (char symbol : charactersInString) {
            if (!characters.containsKey(symbol)) {
                characters.put(symbol, 1);
            } else if (characters.containsKey(symbol)) {
                int temp = characters.get(symbol) + 1;
                characters.put(symbol, temp);
            }
        }

        for (Map.Entry<Character, Integer> rune : characters.entrySet()) {
            System.out.println(rune.getKey() + ": " + rune.getValue());
        }
    }
}

