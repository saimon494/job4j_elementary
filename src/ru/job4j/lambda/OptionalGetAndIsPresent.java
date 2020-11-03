package ru.job4j.lambda;

import java.util.Optional;

public class OptionalGetAndIsPresent {
    public static int get(int[] data, int el) {
        Optional<Integer> index = indexOf(data, el);
        if (index.isEmpty()) {
            return -1;
        } else {
            return index.get();
        }
    }

    private static Optional<Integer> indexOf(int[] data, int el) {
        Optional<Integer> index = Optional.empty();
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                index = Optional.of(i);
                break;
            }
        }
        return index;
    }
}
