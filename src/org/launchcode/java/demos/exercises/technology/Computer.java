package org.launchcode.java.demos.exercises.technology;

public class Computer extends AbstractEntity{
    private double storageSize;
    private double cpuSpeed;
    private String operatingSystem;

    public Computer(double storageSize, double cpuSpeed, String operatingSystem) {
        this.storageSize = storageSize;
        this.cpuSpeed = cpuSpeed;
        this.operatingSystem = operatingSystem;
    }

    public double getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(double storageSize) {
        this.storageSize = storageSize;
    }

    public double getCpuSpeed() {
        return cpuSpeed;
    }

    public void setCpuSpeed(double cpuSpeed) {
        this.cpuSpeed = cpuSpeed;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
///// begin sketched out methods
    public void overClock() {
        double newSpeed = cpuSpeed * 1.3;
        this.setCpuSpeed(newSpeed);
    }

    public void update(String newOS) {
        operatingSystem = newOS;
    }
}
