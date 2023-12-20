package com.homework.phone.phones.name.models;
import com.homework.phone.enums.NamePhone;
import com.homework.phone.phones.name.Samsung;

public class GalaxyA extends Samsung {


    public GalaxyA(String model, String color, int RAM, double diagonal, int camera, boolean usability) {
        super(model, color, RAM, diagonal, camera, usability);
        name = NamePhone.GalaxyA;
    }

    @Override
    public String toString() {
        return "GalaxyA{" +
                "name=" + name +
                "} " + super.toString();
    }
}
