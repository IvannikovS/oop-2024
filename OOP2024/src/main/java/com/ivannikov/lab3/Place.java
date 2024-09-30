package com.ivannikov.lab3;

public class Place {
    private String placeName;
    private String city;
    public static final String DEFAULT_CITY = "Воронеж";
    private static int placeCount;

    // Статический блок - инициализация класса Place
    static {
        System.out.println("Инициализация класса Place");
        placeCount = 0;
    }

    // Нестатический блок
    {
        System.out.println("Создано новое место(Place). Сообщение из нестаического блока");
    }

    public Place(String placeName, String city) {
        this.placeName = placeName;
        if (city == null || city.isEmpty()) {
            this.city = DEFAULT_CITY;
            System.out.println("Город не указан. Установлено значение по умолчанию: " + DEFAULT_CITY);
        } else {
            this.city = city;
        }
        placeCount++;
    }

    public String getPlaceName() {
        return placeName;
    }

    public String getCity() {
        return city;
    }

    public static int getPlaceCount() {
        return placeCount;
    }


    public String getDescription() {
        return "Это место под названием " + placeName + " в городе " + city;
    }

    @Override
    public String toString() {
        return "Place{placeName='" + placeName + "', city='" + city + "'}";
    }
}

