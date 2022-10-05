package org.launchcode.java.demos.studios.quizzes;

public class CheckBox extends Question{
    public CheckBox(int pointValue, String text) {
        super(pointValue, text);
    }

    @Override
    public void displayAnswers() {

    }

    @Override
    public char[] getAnswers() {
        return {'z'};
    }
}
