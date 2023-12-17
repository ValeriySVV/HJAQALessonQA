package com.homework.phone.phones.name.models;

import com.homework.phone.enums.NamePhone;
import com.homework.phone.phones.name.Samsung;

public class GalaxyFlip extends Samsung {

    public GalaxyFlip(String color, int RAM, double diagonal, int camera, boolean usability) {
        super(color, RAM, diagonal, camera, usability);
        name = NamePhone.GalaxyFlip;
    }

    @Override
    public String toString() {
        return "GalaxyFlip{" +
                "name=" + name +
                "} " + super.toString();
    }
}
