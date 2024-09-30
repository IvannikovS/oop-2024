package com.ivannikov.lab3;

public class Resident extends Person {
    private String address;
    public static final String DEFAULT_ADDRESS = "Площадь Ленина, 1";


    // Нестатический блок - логирование создания объекта Resident
    {
        System.out.println("Создается объект Resident. Сообщение из нестаического блока");
    }

    public Resident(String name, int age, String address) {
        super(name, age);
        if (address == null || address.isEmpty()) {
            this.address = DEFAULT_ADDRESS;
            System.out.println("Адрес не указан. Установлено значение по умолчанию: " + DEFAULT_ADDRESS);
        } else {
            this.address = address;
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Полиморфизм
    @Override
    public String getRole() {
        return "Resident";
    }

    @Override
    public String toString() {
        return super.toString() + ", проживает по адресу: " + address;
    }
}