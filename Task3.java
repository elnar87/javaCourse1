package ru.inno.course.certification;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите длину массива: ");
        int len = sc.nextInt();
        int[] array = new int[len];
        System.out.printf("Введите элементы массива: ");
        for (int i = 0; i < len; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Исходный массив: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Отсортированный массив: " + Arrays.toString(array));
        System.out.println("Второй по величине элемент: " + array[array.length - 2]);


    }
}
