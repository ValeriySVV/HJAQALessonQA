package com.homework.phone.phones.name;

import com.homework.phone.Phone;

public class Huawei extends Phone {

    private String country;

    public Huawei(String os, String type, int size, int price, String country) {
        super(os, type, size, price);
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public void soundSms() {

    }

    @Override
    public void soundCall() {

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Huawei{");
        sb.append("country='").append(country).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
