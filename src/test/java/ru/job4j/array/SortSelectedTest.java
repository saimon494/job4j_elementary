package ru.job4j.array;

import org.junit.Test;
import ru.job4j.array.SortSelected;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }
    @Test
    public void whenSort2() {
        int[] input = new int[] {3, 10, 14, 2, 5, 13};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {2, 3, 5, 10, 13, 14};
        assertThat(result, is(expect));
    }
}