package com.ivannikov.lab1;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Иван", 25);
        Place place = new Place("Орленок", "Воронеж");
        PersonInPlace personInPlace = new PersonInPlace(person, place);
        System.out.println(person.toString());
        System.out.println(place.toString());
        System.out.println(personInPlace.toString());

        System.out.println("---------------------------------------------------------------------------------------");

        Resident resident = new Resident("Мария", 19, "Улица Ленина, дом 10");
        Park park = new Park("Парк Победы", "Саратов", "национальный парк");
        System.out.println(resident.toString());
        System.out.println(park.toString());
    }
}
