package com.ivannikov.lab1;

public class Park extends Place{
    private final String parkType;

    public Park(String placeName, String city, String parkType) {
        super(placeName, city);
        this.parkType = parkType;
    }

    public String getParkType() {
        return parkType;
    }

    @Override
    public String toString() {
        return super.toString() + ", тип парка: " + parkType;
    }
}
