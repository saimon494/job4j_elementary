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
    public void whenMax25To10Then25() {
        int result = Max.max(25, 10);
        assertThat(result, is(25));
    }

    @Test
    public void whenMax15To15Then15() {
        int result = Max.max(15, 15);
        assertThat(result, is(15));
    }
}