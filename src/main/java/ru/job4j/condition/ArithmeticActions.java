package ru.job4j.condition;

public class ArithmeticActions {
    public static String selectAction(int left, int right, int rsl) {
        String s = "none";
        if (left + right == rsl) {
            s = "added";
        } else if (left - right == rsl) {
            s = "subtracted";
        } else if (left * right == rsl) {
            s = "multiplied";
        } else if (left / right == rsl) {
            s = "divided";
        }
        return s;
    }
}
