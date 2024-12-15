package ru.inno.course.certification;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] knb = {"К", "Н", "Б"};
        int javaScore = 0, userScore = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Раунд " + i);
            System.out.println("Введите значение \"К\", \"Н\", \"Б\": ");
            String userInput = scanner.nextLine().toUpperCase();
            String javaChoice = knb[random.nextInt(knb.length)];
            System.out.println(javaChoice);
            int k = 1, n = 2, b = 5;

            if (userInput.equals(javaChoice)) {
                {
                    System.out.println("Ничья\n");
                }

            } else if ((userInput.equals("К")) && (javaChoice.equals("Н")) ||
                    (userInput.equals("Н")) && (javaChoice.equals("Б")) ||
                    (userInput.equals("Б")) && (javaChoice.equals("К"))) {
                    System.out.println("Раунд выиграл user\n");
                    userScore += (userInput.equals("K")) ? 1 : (userInput.equals("Н")) ? 2 : 5;

            } else {
                System.out.println("Раунд выиграл java\n");
                javaScore += (javaChoice.equals("К")) ? 1 : (javaChoice.equals("Н")) ? 2 : 5;

            }
        } if (userScore > javaScore) {
            System.out.println("Победитель user");
        } else {
            System.out.println("Победитель java");
        }

    }
}
