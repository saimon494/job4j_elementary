package ru.job4j.stream;

import java.util.List;

public class AnyMatchMethod {
    public static boolean check(List<String> data) {
        return data.stream()
                .anyMatch(s -> s.startsWith("job4j"));
    }
}
