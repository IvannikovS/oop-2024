package com.ivannikov.util.example_lab2;

public class Parent {
    static {
        System.out.println("Статический блок Parent");
    }

    {
        System.out.println("Нестатический блок Parent");
    }

    public Parent() {
        System.out.println("Конструктор Parent");
    }
}
