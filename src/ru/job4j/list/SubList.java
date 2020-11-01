package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class SubList {
    public static List<String> getElementsBetweenIndexes(List<String> list, String el) {
        int firstIndex = list.indexOf(el);
        int lastIndex = list.lastIndexOf(el);
        if (!list.contains(el) || firstIndex == lastIndex) {
            list = new ArrayList<>();
        } else {
            list = list.subList(firstIndex, lastIndex);
        }
        return list;
    }
}
