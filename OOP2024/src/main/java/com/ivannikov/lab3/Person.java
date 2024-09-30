package com.ivannikov.lab3;

public class Person {
    private String name;
    private int age;
    public static final int MAX_AGE = 150;
    private static int personCount;

    // Статический блок
    static {
        System.out.println("Инициализация класса Person");
        personCount = 0;
    }

    // Нестатический блок
    {
        System.out.println("Создается объект класса Person. Сообщение из нестаического блока");
    }

    public Person(String name, int age) {
        this.name = name;
        if (age < 0 || age > MAX_AGE) {
            System.out.println("Возраст недопустим! Установлен на 0 по умолчанию.");
            this.age = 0;
        } else {
            this.age = age;
        }
        personCount++;
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
        if (age >= 0 && age <= MAX_AGE) {
            this.age = age;
        } else {
            System.out.println("Возраст недопустим! Установлено значение по умолчанию.");
            this.age = 0;
        }
    }

    public static int getPersonCount() {
        return personCount;
    }

    public String getRole() {
        return "Person";
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
