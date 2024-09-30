package com.ivannikov.lab1;

public class PersonInPlace {
    private Person person;
    private Place place;

    public PersonInPlace(Person person, Place place) {
        this.person = person;
        this.place = place;
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
