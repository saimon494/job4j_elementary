package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFrom1To10Then30() {
        int rsl = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFrom5To8Then14() {
        int rsl = Counter.sumByEven(5, 8);
        int expected = 14;
        assertThat(rsl, is(expected));
    }
}