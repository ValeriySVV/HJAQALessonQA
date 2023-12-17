package com.homework.phone.phones.name.models;

import com.homework.phone.enums.NamePhone;
import com.homework.phone.phones.name.Samsung;

import java.util.StringJoiner;

public class GalaxyS extends Samsung {

    private String models;

    public GalaxyS(String model, String type, int size, int price, String design, boolean usability, String models) {
        super(model, type, size, price, design, usability);
        this.models = models;
        name = NamePhone.GalaxyS;
    }

    public String getModels() {
        return models;
    }

    public void setModels(String models) {
        this.models = models;
    }

    @Override
    public String toString() {
        return "GalaxyS{" +
                "models='" + models + '\'' +
                ", name=" + name +
                "} " + super.toString();
    }
}

