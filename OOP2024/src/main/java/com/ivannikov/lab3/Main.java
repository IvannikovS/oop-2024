package com.ivannikov.lab3;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Person person1 = new Person("Иван", 25);
        Person person2 = new Person("Лена", 33);
        Resident resident1 = new Resident("Max", 21, "ул. Ленина, 15");
        Person resident2 = new Resident("Серёжа", 27, "ул. Театральная, 43");
        System.out.println(resident2.toString());
        System.out.println(person1.getRole());
        System.out.println(resident1.getRole());
        System.out.println("Люди: " + Person.getPersonCount());
        Person person3 = new Person("Ирина", 300);
        System.out.println(person3.toString());
        System.out.println("Люди: " + Person.getPersonCount());
        System.out.println("==============================================================");

        Place place1 = new Place("Орленок", "Воронеж");
        Place place2 = new Place("ВГУ", "");
        System.out.println(place2.getCity());
        Park park = new Park("Парк Победы", "Саратов", "национальный парк");
        System.out.println("Места:" + Place.getPlaceCount());
        System.out.println("Парки:" + Park.getParkCount());
        System.out.println(place1.getDescription());
        System.out.println(park.getDescription());
        Thread.sleep(3000);
        park.visit();
        System.out.println(park.getLastVisitTime());
        System.out.println("==============================================================");


        PersonInPlace personInPlace1 = new PersonInPlace(person1, place2);
        System.out.println(personInPlace1.toString());
        PersonInPlace personInPlace2 = new PersonInPlace(resident1, place2);
        System.out.println(personInPlace2.getPerson().toString());
    }
}
