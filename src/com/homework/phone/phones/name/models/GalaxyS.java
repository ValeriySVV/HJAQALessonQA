package com.homework.phone.phones.name.models;

import com.homework.phone.enums.NamePhone;
import com.homework.phone.phones.name.Samsung;

import java.util.StringJoiner;

public class GalaxyS extends Samsung {

    public GalaxyS(String model, String color, int RAM, double diagonal, int camera, boolean usability) {
        super(model, color, RAM, diagonal, camera, usability);
        name = NamePhone.GalaxyS;
    }

    @Override
    public String toString() {
        return "GalaxyS{" +
                "name=" + name +
                "} " + super.toString();
    }
}

