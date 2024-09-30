package com.ivannikov.util.example_lab3;

import java.time.LocalDateTime;

public class Server {
    // Статическая переменная для подсчета объектов
    private static int instanceCount;

    // Приватная нестатическая переменная для хранения времени создания объекта
    private LocalDateTime creationTime;

    // Статический блок для инициализации счетчика
    static {
        System.out.println("Статический блок: Инициализация класса Server");
        instanceCount = 0;
    }

    // Нестатический блок для логирования времени создания объекта
    {
        creationTime = LocalDateTime.now();
        System.out.println("Нестатический блок: Объект создан в " + creationTime);
        instanceCount++;
    }

    public Server() {
        System.out.println("Конструктор Server: Всего создано объектов: " + instanceCount);
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }
}
