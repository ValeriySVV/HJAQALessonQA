package com.homework.phone;

public abstract class Phone {

    private String color;
    private int RAM = 16;
    private double diagonal;
    private int camera;
    private boolean usability = true;

    public Phone(String color, int RAM, double diagonal, int camera, boolean usability) {
        this.color = color;
        this.RAM = RAM;
        this.diagonal = diagonal;
        this.camera = camera;
        this.usability = usability;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public boolean isUsability() {
        return usability;
    }

    public void setUsability(boolean usability) {
        this.usability = usability;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "color='" + color + '\'' +
                ", RAM=" + RAM +
                ", diagonal=" + diagonal +
                ", camera=" + camera +
                ", usability=" + usability +
                '}';
    }

    public abstract void soundSms();
    public abstract void soundCall();


}




