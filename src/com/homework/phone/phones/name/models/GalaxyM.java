package com.homework.phone.phones.name.models;

import com.homework.phone.enums.NamePhone;
import com.homework.phone.phones.name.Samsung;

public class GalaxyM extends Samsung {
    public GalaxyM(String model, String type, int size, int price, String design, boolean usability) {
        super(model, type, size, price, design, usability);
        name = NamePhone.GalaxyM;
    }

    @Override
    public String toString() {
        return "GalaxyM{" +
                "name=" + name +
                "} " + super.toString();
    }
}
