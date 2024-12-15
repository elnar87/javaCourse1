package ru.inno.course.certification;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите длину забора в см: ");
        int lenZabor = sc.nextInt(); // Длина забора
        int lenWords = 346; // Общая длина надписи с пробелами
        if (lenZabor < lenWords) {
            System.out.println("Надпись поместится на заборе.");
        } else {
            System.out.println("Надпись не поместится на заборе.");
        }


    }
}
