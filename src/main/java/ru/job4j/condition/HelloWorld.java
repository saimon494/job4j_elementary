package ru.job4j.condition;

public class HelloWorld {
    public static String checkNumber(int number) {
        String s = "Operation not support";
        if (number % 3 == 0) {
            s = "Hello";
            if (number % 5 == 0) {
                s = "Hello, World!!!";
            }
        } else if (number % 5 == 0) {
            s = "World";
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(checkNumber(15));
    }
}
