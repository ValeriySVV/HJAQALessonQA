package com.homework.phone.phones.name.models;

import com.homework.phone.enums.NamePhone;
import com.homework.phone.phones.name.Samsung;

public class GalaxyFlip extends Samsung {
    public GalaxyFlip(String model, String type, int size, int price, String design, boolean usability) {
        super(model, type, size, price, design, usability);
        name = NamePhone.GalaxyFlip;
    }

    @Override
    public String toString() {
        return "GalaxyFlip{" +
                "name=" + name +
                "} " + super.toString();
    }
}
