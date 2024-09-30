package com.ivannikov.lab3;

public class PersonInPlace {
    private Person person;
    private Place place;

    static {
        System.out.println("Статический блок в PersonInPlace.");
    }


    {
        System.out.println("Экземплярный(нестатический) в PersonInPlace.");
    }

    public PersonInPlace(Person person, Place place) {
        this.person = person;
        this.place = place;
        System.out.println("Конструктор класса PersonInPlace.");
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return person.toString() + " находится в " + place.toString();
    }
}
