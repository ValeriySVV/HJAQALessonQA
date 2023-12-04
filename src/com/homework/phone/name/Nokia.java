package com.homework.phone.name;

import com.homework.phone.Phone;
import com.homework.phone.interface_class.Functional;

public class Nokia extends Phone implements Functional {

    private int year;

    public Nokia(String os, String type, int size, int price, int year) {
        super(os, type, size, price);
        this.year = year;
    }
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void soundSms() {

    }

    @Override
    public void soundCall() {

    }


    @Override
    public void security(String password) {
        System.out.println("com.homework.phone.name.Nokia security is" + password);

    }

    @Override
    public void faceId(boolean faceId) {
        Functional.super.faceId(faceId);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Nokia{");
        sb.append("year=").append(year);
        sb.append('}');
        return sb.toString();
    }
}
