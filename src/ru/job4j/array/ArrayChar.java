package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int i = 0; i < pref.length; i++) {
            for (int j = 0; j == i; j++) {
                result = pref[j] == word[i] && pref[j + 1] == word[i + 1];
            }
        }
        return result;
    }
}
