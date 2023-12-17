package com.homework.phone.phones.name.models;
import com.homework.phone.enums.NamePhone;
import com.homework.phone.phones.name.Samsung;

public class GalaxyA extends Samsung {


    public GalaxyA(String model, String type, int size, int price, String design, boolean usability) {
        super(model, type, size, price, design, usability);
        name = NamePhone.GalaxyA;

    }

    @Override
    public String toString() {
        return "GalaxyA{" +
                "name=" + name +
                "} " + super.toString();
    }
}
