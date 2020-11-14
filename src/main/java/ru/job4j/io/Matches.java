package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int matches = 11;
        int amount;

        do {
            System.out.print("Введите количество спичек от 1 до 3: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Это не число. Повторите ввод: ");
                scanner.next();
            }
            amount = scanner.nextInt();
            if (amount > 3 || amount < 1) {
                System.out.println("Число не в диапазоне");
//                scanner.next();
            } else {
                matches -= amount;
                count++;
                System.out.println("Осталось " + matches + " спичек");
            }

        } while (matches > 0);

        if (count % 2 != 0) {
            System.out.println("Первый игрок победил");
        } else {
            System.out.println("Второй игрок победил");
        }
    }
}
