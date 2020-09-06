package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenFactorial5Then120() {
        int rsl = Factorial.calc(5);
        assertThat(rsl, is(120));
    }

    @Test
    public void whenFactorial0Then1() {
        int rsl = Factorial.calc(0);
        assertThat(rsl, is(1));
    }

    @Test
    public void whenFactorial1Then1() {
        int rsl = Factorial.calc(1);
        assertThat(rsl, is(1));
    }

    @Test
    public void whenFactorial3Then6() {
        int rsl = Factorial.calc(3);
        assertThat(rsl, is(6));
    }
}