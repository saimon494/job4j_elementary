package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
//        int matches = 11;
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        for (int matches = 11; matches > 0;) {
            System.out.print("Введите количество спичек от 1 до 3: ");
            matches -= scanner.nextInt();
            count++;
            System.out.println("Осталось " + matches + " спичек");
        }
        if (count % 2 != 0) {
            System.out.println("Первый игрок победил");
        } else {
            System.out.println("Второй игрок победил");
        }
    }
}
