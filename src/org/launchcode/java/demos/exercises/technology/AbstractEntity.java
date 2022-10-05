package org.launchcode.java.demos.exercises.technology;

public abstract class AbstractEntity {
    private int id;
    private static int nextID = 1;

    public AbstractEntity() {
        this.id = AbstractEntity.nextID;
        AbstractEntity.nextID++;
    }

    //abstract class Bank {
    //abstract int getRateOfInterest();
    //}
}
