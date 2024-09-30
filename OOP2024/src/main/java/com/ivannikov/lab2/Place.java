package com.ivannikov.lab2;

public class Place {
    private String placeName;
    private String city;

    public Place(String placeName, String city) {
        this.placeName = placeName;
        this.city = city;
        System.out.println("Конструктор класса Place.");
    }

    static {
        System.out.println("Статический блок 1 в Place.");
    }


    {
        System.out.println("Экземплярный(нестатический) блок 1 в Place.");
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
