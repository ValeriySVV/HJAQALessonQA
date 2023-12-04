package com.homework.phone;

public abstract class Phone {

    private String model;
    static String os;
    String type;
    int size;
    static int price;


    public Phone(String model, String type, int size, int price) {
        this.model = model;
        this.type = type;
        this.size = size;
        this.price = price;
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




