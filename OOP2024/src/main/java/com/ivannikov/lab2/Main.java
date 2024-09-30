package com.ivannikov.lab2;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Иван", 25);
        Person person1 = new Person("bb",32);




        Place place = new Place("Орленок", "Воронеж");
        PersonInPlace personInPlace = new PersonInPlace(person, place);

        System.out.println("---------------------------------------------------------------------------------------");

        Park park = new Park("Парк Победы", "Саратов", "национальный парк");
    }
}
