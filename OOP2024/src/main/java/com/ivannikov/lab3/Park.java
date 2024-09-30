package com.ivannikov.lab3;

import java.time.LocalDateTime;

public class Park extends Place {
    private final String parkType;
    public static final String DEFAULT_PARK_TYPE = "Public";
    private static int parkCount;
    private LocalDateTime creationTime;
    private LocalDateTime lastVisitTime;

    // Статический блок - инициализация класса Park
    static {
        System.out.println("Инициализация класса Park");
        parkCount = 0;
    }

    // Нестатический блок
    {
        parkCount++;
        this.creationTime = LocalDateTime.now();  // Записываем время создания объекта
        this.lastVisitTime = creationTime;  // Инициализируем последнее посещение парка временем создания
        System.out.println("Парк был создан в: " + creationTime + ", последнее посещение: " + lastVisitTime);
    }

    public Park(String placeName, String city, String parkType) {
        super(placeName, city);
        if (parkType == null || parkType.isEmpty()) {
            this.parkType = DEFAULT_PARK_TYPE;
            System.out.println("Тип парка не указан. Установлено значение по умолчанию: " + DEFAULT_PARK_TYPE);
        } else {
            this.parkType = parkType;
        }
    }

    public void visit() {
        this.lastVisitTime = LocalDateTime.now();
        System.out.println("Парк " + getPlaceName() + " был посещен в: " + lastVisitTime);
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public LocalDateTime getLastVisitTime() {
        return lastVisitTime;
    }

    public String getParkType() {
        return parkType;
    }

    public static int getParkCount() {
        return parkCount;
    }

    @Override
    public String getDescription() {
        return "Это парк типа " + parkType + " в городе " + getCity();
    }

    @Override
    public String toString() {
        return super.toString() + ", тип парка: " + parkType + ", открыт в: " + creationTime + ", последнее посещение: " + lastVisitTime;
    }
}

