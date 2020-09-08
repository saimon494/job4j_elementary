package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To10Then10() {
        int result = Max.max(1, 10);
        assertThat(result, is(10));
    }

    @Test
    public void whenMax25To10To73Then73() {
        int result = Max.max(25, 10, 73);
        assertThat(result, is(73));
    }

    @Test
    public void whenMax1To15To25To14Then25() {
        int result = Max.max(1, 15, 25, 14);
        assertThat(result, is(25));
    }
}