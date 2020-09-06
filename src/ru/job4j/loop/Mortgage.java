package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 1;
        int credit = amount * (int) percent / 100 + amount;
        int remainder;
        boolean isEnough = salary < credit;
        while (isEnough) {
            year++;
            remainder = credit - salary;
            credit = remainder * (int) percent / 100 + remainder;
            if (salary > credit) {
                isEnough = false;
            }
        }
        return year;
    }
}
