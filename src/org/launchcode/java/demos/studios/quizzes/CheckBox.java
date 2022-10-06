package org.launchcode.java.demos.studios.quizzes;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Character.toLowerCase;

public class CheckBox extends Question{

    private String[] answers;
    private char[] answerKey;

    public CheckBox(int pointValue, String text, String[] answers, char[] answerKey) {
        super(pointValue, text);
        this.answers = answers;
        for (int i = 0; i < answerKey.length; i++) {
            this.answerKey[i] = toLowerCase(answerKey[i]);
        }
    }

    @Override
    public void displayAnswers() {
        char opt = 'a';
        for (String option : answers) {
            System.out.println(opt + " " + option);
            opt++;
        }
    }

    public void correctAnswer (char[] choice) {
        int numberCorrect = 0;
        Arrays.sort(choice);
        Arrays.sort(answerKey);
        for (int i = 0; i < choice.length; i++) {
            if (Arrays.binarySearch(answerKey, choice[i]) >= 0) {
                numberCorrect++;
            }
        }
        setPointValue(numberCorrect);
    }

    @Override
    public char[] getAnswers() {
        char[] selection = {};
        Scanner input = new Scanner(System.in);
        System.out.println("Please select which options you believe are correct, by entering the corresponding letters.\n" +
                "For instance, if 'A', 'C' and 'D' are correct—enter 'ACD'.");
        String response = input.nextLine();
        selection = response.toCharArray();
        for (int i = 0; i < selection.length; i++) {
            toLowerCase(selection[i]);
        }
        return selection;
    }
}
