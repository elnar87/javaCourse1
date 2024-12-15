package ru.inno.course.certification.task2;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;


public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите дату в формате ДД.ММ.ГГГГ: ");
        String input = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate date = LocalDate.parse(input, formatter);

        Month userMonth = date.getMonth();
        Month[] winter = { Month.DECEMBER, Month.JANUARY, Month.FEBRUARY };
        Month[] spring = { Month.MARCH, Month.APRIL, Month.MAY };
        Month[] autumn = { Month.SEPTEMBER, Month.OCTOBER, Month.NOVEMBER };

        Sensor airHumidity = new Sensor(0); // Создаем экземпляр класса Влажность воздуха
        int randomHumidity = airHumidity.getHumidity();
        System.out.println("Влажность воздуха :" + randomHumidity);

        if (Arrays.asList(winter).contains(userMonth)) {

        } else if (Arrays.asList(spring).contains(userMonth)) {

        } else if (Arrays.asList(autumn).contains(userMonth)) {

        } else if (randomHumidity < 30) {

        }









    }

}
