package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student me = new Student("Eric Lyonford", 42, 1, 4.0);
        System.out.println(me.getName() + ", student # " + me.getStudentId() + ", has " + me.getNumberOfCredits() + " credit(s) and a " + me.getGpa() + " GPA.");
    }
}
