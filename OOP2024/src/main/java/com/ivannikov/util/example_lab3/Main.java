package com.ivannikov.util.example_lab3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Создание первого объекта Server:");
        Server server1 = new Server();
        System.out.println("Время создания первого объекта: " + server1.getCreationTime());

        System.out.println("\nСоздание второго объекта Server:");
        Server server2 = new Server();
        System.out.println("Время создания второго объекта: " + server2.getCreationTime());

        System.out.println("\nВсего создано объектов: " + Server.getInstanceCount());
    }
}
