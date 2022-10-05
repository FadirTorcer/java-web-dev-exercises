package org.launchcode.java.demos.studios.quizzes;
import java.util.Scanner;
public class MultipleChoice extends Question {

    private String[] answers;
    private char answerKey;

    public MultipleChoice(int pointValue, String text, String[] answers, char answerKey) {
        super(pointValue, text);
        this.answers = answers;
        this.answerKey = answerKey;
    }

    @Override
    public void displayAnswers() {
        char opt = 'a';
        for (String option : answers) {
            System.out.println(opt + " " + option);
            opt++;
        }
    }

    public boolean correctAnswer (char choice) {
        if (choice == answerKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public char[] getAnswers() {
        char[] selection = new char[];
        Scanner input = new Scanner(System.in);

        return selection;
    }
}
