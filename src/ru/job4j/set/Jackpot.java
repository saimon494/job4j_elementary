package ru.job4j.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Jackpot {
    public static boolean checkYourWin(String[] combination) {
        Set<String> win = new HashSet<>(Arrays.asList(combination));
        return win.size() == 1;
    }

    public static boolean checkString(String s) {
        String[] arr = s.split("");
        Set<String> win = new HashSet<>(Arrays.asList(arr));
        return s.length() == win.size();
    }
}
