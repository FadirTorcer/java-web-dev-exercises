package org.launchcode.java.demos.exercises;

import java.util.Scanner;

public class Wonderland {

    public static void main(String[] args) {
        String quote = "Alice was beginning to get very tired of sitting by her sister on the bank," +
                " and of having nothing to do: once or twice she had peeped into the book her sister was reading," +
                " but it had no pictures or conversations in it, 'and what is the use of a book,'" +
                " thought Alice 'without pictures or conversation?'";
        Scanner input = new Scanner(System.in);

        System.out.println("Do you remember the first line from \"Alice's Adventures in Wonderland\"?");
        System.out.println("Let's test that memory! Enter a word you think is in the line: ");
        String guess = input.nextLine();
        input.close();

        //System.out.println("Is your word in the first line?");
        //System.out.println (quote.toLowerCase().contains(guess.toLowerCase()));
        if (quote.toLowerCase().contains(guess.toLowerCase())) {
            System.out.println ("It is in the first line! The first instance of this phrase is located at index " + quote.indexOf(guess) + ".");
            System.out.println("Remember, the first index is index 0. The phrase's length is " + guess.length() + " characters.");
        } else {
            System.out.println("I'm sorry, the first line does NOT contain that phrase.");
        }

        String excised = quote.replace(guess, "");
        System.out.println("Here is the first line with the first instance of your guess removed:");
        System.out.println(excised);
    }
}
