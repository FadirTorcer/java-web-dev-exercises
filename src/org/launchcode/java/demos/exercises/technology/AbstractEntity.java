package org.launchcode.java.demos.exercises.technology;

public class AbstractEntity {
    private int id;
    private static int nextID = 1;

    public void AbstractEntity() {
        this.id = AbstractEntity.nextID;
        AbstractEntity.nextID++;
    }
}
