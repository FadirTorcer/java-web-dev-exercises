package org.launchcode.java.demos.exercises.technology;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Program {

    Computer new_computer;
    Laptop new_laptop;
    SmartPhone new_smartPhone;
    @Before
    public void createComputer() {
        new_computer = new Computer(256000000000.0, 1600000, "Windows NT");
    }

    //Assert that computer initializes correctly
    @Test
    public void testInitialStorage() {
        assertEquals(256000000000.0, new_computer.getStorageSize(), .001);
    }

    @Test
    public void testOSUpdateWorks() {
        new_computer.update("Windows 10");
        assertEquals("Windows 10", new_computer.getOperatingSystem());
    }

    @Test
    public void checkOverClock() {
        new_computer.overClock();
        assertEquals((1600000*1.3), new_computer.getCpuSpeed(), 0.001);
    }

    @Before
    public void bootLaptop() {
        new_laptop = new Laptop(128000000000.0, 800000, "Windows RT");
        new_laptop.setScreenSize("14 inches");
        new_laptop.setNumberOfPorts(4);
    }

    @Test
    public void checkDisablePorts() {
        new_laptop.disableUSB();
        assertEquals(0, new_laptop.getNumberOfPorts(), 0.001);
    }
    @Test
    public void verifyUpdateWorks() {
        new_laptop.update("Windows 11");
        assertEquals("Windows 11", new_laptop.getOperatingSystem());
    }

    @Test
    public void checkPorts() {
        assertEquals(4, new_laptop.getNumberOfPorts(), .001);
    }

    @Before
    public void unplugSmartPhone() {
        new_smartPhone = new SmartPhone(64000000000.0, 1000000, "Android Oreo");
        new_smartPhone.setCameraResolution(24);
    }

    @Test
    public void verifyPhoneUpdateWorks() {
        new_smartPhone.update("Android Pie");
        assertEquals("Android Pie", new_smartPhone.getOperatingSystem());
    }

    @Test
    public void testPhotoFileSize() {
        new_smartPhone.takePicture();
        assertEquals(64000000000.0-(new_smartPhone.getCameraResolution()*3000000000.0), new_smartPhone.getStorageSize(), .001);
    }

    @Test
    public void getProcessorSpeed() {
        assertEquals(1000000, new_smartPhone.getCpuSpeed(), .001);
    }
}
