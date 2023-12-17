package com.homework.phone.phones.name.models;

import com.homework.phone.enums.NamePhone;
import com.homework.phone.phones.name.Samsung;

public class GalaxyM extends Samsung {

    public GalaxyM(String color, int RAM, double diagonal, int camera, boolean usability) {
        super(color, RAM, diagonal, camera, usability);
        name = NamePhone.GalaxyM;
    }

    @Override
    public String toString() {
        return "GalaxyM{" +
                "name=" + name +
                "} " + super.toString();
    }
}
