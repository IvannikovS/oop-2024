package com.ivannikov.lab2;

public class Park extends Place {
    private final String parkType;

    static {
        System.out.println("Статический блок 1 в Park.");
    }


    {
        System.out.println("Экземплярный(нестатический) блок 1 в Park.");
    }

    public Park(String placeName, String city, String parkType) {
        super(placeName, city);
        this.parkType = parkType;
        System.out.println("Конструктор класса Park.");
    }


    public String getParkType() {
        return parkType;
    }

    @Override
    public String toString() {
        return super.toString() + ", тип парка: " + parkType;
    }
}
