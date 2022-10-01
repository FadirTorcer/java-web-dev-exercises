package org.launchcode.java.demos.exercises.technology;

public class Computer {
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
    public double[] boot() {
        return new double[]{storageSize, cpuSpeed};
    }

    public void update(String newOS) {
        operatingSystem = newOS;
    }
}
