package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class ConeComparator implements Comparator <Cone> {
    @Override
    public int compare(Cone o1, Cone o2) {
        int solution;
        if (o1.getCost() > o2.getCost()) {
            solution = 1;
        } else if (o1.getCost() == o2.getCost()) {
            solution = 0;
        } else {
            solution = -1;
        }
        return solution;
    }
}
