package com.ivannikov.lab2;

public class Resident extends Person {

    private String address;

    public Resident(String name, int age, String address) {
        super(name, age);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return super.toString() + ", проживает по адресу: " + address;
    }
}
