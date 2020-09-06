package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = 0; i < post.length - 1; i++) {
            for (int j = word.length - post.length; j < word.length - 1; j++) {
                result = post[i] == word[j] && post[i + 1] == word[j + 1];
            }
        }
        return result;
    }
}
