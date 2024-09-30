package com.ivannikov.util.example_lab2;

public class Child extends Parent {
    static {
        System.out.println("Статический блок Child");
    }

    {
        System.out.println("Нестатический блок Child");
    }

    public Child() {
        System.out.println("Конструктор Child");
    }
}
