package com.homework.phone;

public abstract class Phone {

    private String model;
    private static String os;
    private String type;
    private int size;
    private static int price;


    public Phone(String model, String type, int size, int price) {
        this.model = model;
        this.type = type;
        this.size = size;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public static String getOs() {
        return os;
    }

    public static void setOs(String os) {
        Phone.os = os;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public static int getPrice() {
        return price;
    }

    public static void setPrice(int price) {
        Phone.price = price;
    }

    @Override
    public String toString() {
        return "com.homework.phone.Phone{" +
                "model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", size=" + size +
                ", price=" + price +
                '}';
    }

    public abstract void soundSms();
    public abstract void soundCall();


}




