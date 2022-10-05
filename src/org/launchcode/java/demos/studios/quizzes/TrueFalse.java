package org.launchcode.java.demos.studios.quizzes;

public class TrueFalse extends Question{
    public TrueFalse(int pointValue, String text) {
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
