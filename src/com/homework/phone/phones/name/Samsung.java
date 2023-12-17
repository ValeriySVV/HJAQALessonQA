package com.homework.phone.phones.name;

import com.homework.phone.Phone;
import com.homework.phone.enums.NamePhone;
import com.homework.phone.phones.interfaceFunction.Functional;

public class Samsung extends Phone  {


    protected NamePhone name = null;

    public Samsung(String color, int RAM, double diagonal, int camera, boolean usability) {
        super(color, RAM, diagonal, camera, usability);
    }

    @Override
    public String toString() {
        return "Samsung{" +
                "name=" + name +
                "} " + super.toString();
    }

    @Override
    public void soundSms() {

    }

    @Override
    public void soundCall() {

    }
    /*
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
        System.out.println("name.com.homework.phone.phones.Samsung security is" + password);//імплементація

    }

    @Override
    public void faceId(boolean faceId) {
        Functional.super.faceId(faceId);
    }//імплементація
*/


}
