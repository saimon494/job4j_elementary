package ru.job4j.list;

import java.util.List;
import java.util.ListIterator;

public class ArProgression {
    public static int checkData(List<Integer> data) {
        ListIterator<Integer> iterator = data.listIterator();
        int sum = iterator.next();
        int mid = 0;
        while (iterator.hasPrevious() && iterator.hasNext()) {
            int left = iterator.previous();
            iterator.next();
            mid = iterator.next();
            if (iterator.hasNext()) {
                int right = iterator.next();
                if (mid == (left + right) / 2) {
                    sum += mid;
                    iterator.previous();
                } else {
                    sum = 0;
                    mid = 0;
                    break;
                }
            }
        }
        sum += mid;
        return sum;
    }
}

