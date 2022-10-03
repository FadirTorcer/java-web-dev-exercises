package org.launchcode.java.demos.exercises.technology;

public class SmartPhone extends Computer {

    private int cameraResolution; // Megapixels

    public SmartPhone(double storageSize, double cpuSpeed, String operatingSystem) {
        super(storageSize, cpuSpeed, operatingSystem);
    }

    public int getCameraResolution() {
        return cameraResolution;
    }

    public void setCameraResolution(int cameraResolution) {
        this.cameraResolution = cameraResolution;
    }

    public void takePicture() {
        this.setStorageSize(this.getStorageSize() - cameraResolution * 3000000000.0);
    }
}
