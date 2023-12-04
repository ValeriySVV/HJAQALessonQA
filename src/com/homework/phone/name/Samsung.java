package com.homework.phone.name;

import com.homework.phone.Phone;
import com.homework.phone.interface_class.Functional;

import java.util.StringJoiner;

public class Samsung extends Phone implements Functional {

    private final String design;
    boolean usability;

    public Samsung(String model, String type, int size, int price, String design, boolean usability) {
        super(model, type, size, price);
        this.design = design;
        this.usability = usability;
    }

    public String getDesign() {
        return design;
    }

    public boolean isUsability() {
        return usability;
    }

    public void setUsability(boolean usability) {
        this.usability = usability;
    }

    @Override
    public void soundSms() {
        System.out.println("Rock ring");//переоприділлення методу з абстрактного класу

    }

    @Override
    public void soundCall() {
        System.out.println("Vibro");//переоприділлення методу з абстрактного класу

    }


    @Override
    public void security(String password) {
        System.out.println("com.homework.phone.name.Samsung security is" + password);//імплементація

    }

    @Override
    public void faceId(boolean faceId) {
        Functional.super.faceId(faceId);
    }//імплементація

    @Override
    public String toString() {
        return "Samsung{" +
                "design='" + design + '\'' +
                ", usability=" + usability +
                '}';
    }
}
