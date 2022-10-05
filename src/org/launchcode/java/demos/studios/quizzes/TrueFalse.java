package org.launchcode.java.demos.studios.quizzes;
import java.util.Scanner;

import static java.lang.Character.toLowerCase;

public class TrueFalse extends Question{

    private char answerKey;

    public TrueFalse(int pointValue, String text, char answerKey) {
        super(pointValue, text);
        this.answerKey = toLowerCase(answerKey);
    }

    @Override
    public void displayAnswers() {
        System.out.println("True or false?");
    }

    public boolean correctAnswer(char[] choice) {
        if (choice[0] == answerKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public char[] getAnswers() {
        char[] selection = {};
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 'T' for true, and 'F' for false.");
        String response = input.nextLine();
        selection[0] = toLowerCase(response.charAt(0));
        return selection;
    }
}
