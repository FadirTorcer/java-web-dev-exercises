package org.launchcode.java.demos.studios.quizzes;
// Question could be an abstract class

public abstract class Question {

    private int pointValue;
    private String text;
    static String[] answers;

    public Question(int pointValue, String text) {
        this.pointValue = pointValue;
        this.text = text;
    }

    public void displayQuestion () {
        System.out.println(text);
    }

    public void setPointValue(int x) {
        this.pointValue = x;
    }

    public int getPointValue()  {
        return this.pointValue;
    }

    public abstract void displayAnswers ();

    public abstract char[] getAnswers();
}