package org.launchcode.java.demos.studios.quizzes;
import java.util.Scanner;

import static java.lang.Character.toLowerCase;

public class MultipleChoice extends Question {

    private String[] answers;
    private char answerKey;

    public MultipleChoice(int pointValue, String text, String[] answers, char answerKey) {
        super(pointValue, text);
        this.answers = answers;
        this.answerKey = toLowerCase(answerKey);
    }

    @Override
    public void displayAnswers() {
        char opt = 'a';
        for (String option : answers) {
            System.out.println(opt + " " + option);
            opt++;
        }
    }

    public boolean correctAnswer (char[] choice) {
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
        System.out.println("Please select which option you believe is correct, by entering the corresponding letter.");
        String response = input.nextLine();
        selection[0] = toLowerCase(response.charAt(0));
        return selection;
    }
}
