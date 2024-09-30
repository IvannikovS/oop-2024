package com.ivannikov.lab1;

public class Place {
    private String placeName;
    private String city;

    public Place(String placeName, String city) {
        this.placeName = placeName;
        this.city = city;
    }

    public String getPlaceName() {
        return placeName;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Place{placeName='" + placeName + "', city='" + city + "'}";
    }
}
