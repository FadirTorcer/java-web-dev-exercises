package org.launchcode.java.demos.exercises.technology;

public class Laptop extends Computer {

    private String screenSize;
    private int numberOfPorts;

    public Laptop(double storageSize, double cpuSpeed, String operatingSystem) {
        super(storageSize, cpuSpeed, operatingSystem);
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public int getNumberOfPorts() {
        return numberOfPorts;
    }

    public void setNumberOfPorts(int numberOfPorts) {
        this.numberOfPorts = numberOfPorts;
    }

    public void disableUSB() {
        numberOfPorts = 0;
    }
}
