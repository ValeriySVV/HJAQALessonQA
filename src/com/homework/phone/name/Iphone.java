package com.homework.phone.name;

import com.homework.phone.Phone;

public class Iphone extends Phone {

   private int version;
    private String color;

    public Iphone(String os, String type,int size, int price, String color, int version) {
        super(os, type, size, price);
        this.color = color;
        this.version = version;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @Override
    public void soundSms() {
        System.out.println("Pin Pin");

    }

    @Override
    public void soundCall() {
        System.out.println("com.homework.phone.name.Iphone Ring");

    }

    @Override
    public String toString() {
        return "Iphone{" +
                "version=" + version +
                ", color='" + color + '\'' +
                "} " + super.toString();
    }
}

