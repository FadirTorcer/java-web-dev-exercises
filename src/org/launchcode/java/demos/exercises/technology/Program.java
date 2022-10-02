package org.launchcode.java.demos.exercises.technology;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Program {

    Computer new_computer;
    @Before
    public void createComputer() {
        new_computer = new Computer(256000000000, 1600000, "Windows NT");
    }

    //Assert that computer initializes correctly
    @Test
    public void testInitialStorage() {
        assertEquals(256000000000, new_computer.getStorageSize(), .001);
    }
}
