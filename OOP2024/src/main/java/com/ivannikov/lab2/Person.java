package com.ivannikov.lab2;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Конструктор класса Person.");
    }


    static {
        System.out.println("Статический блок 1 в Person.");
    }


    {
        System.out.println("Экземплярный(нестатический) блок 1 в Person.");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
