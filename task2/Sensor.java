package ru.inno.course.certification.task2;

import java.util.Random;

// Создаем класс Датчик для получения показания влажности воздуха
public class Sensor {

    private int humidity;

    public Sensor(int humidity) {
        this.humidity = humidity;
    }

    public int getHumidity() {
        int maxHumidity = 100; // максимальная влажность воздуха
        Random humidityGenerator = new Random();
        humidity = humidityGenerator.nextInt(maxHumidity) + 1; // генерируем случайное число влажности
        return humidity; //


    }
}
