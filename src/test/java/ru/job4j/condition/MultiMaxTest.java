package ru.job4j.condition;

import org.junit.Test;
import ru.job4j.condition.MultiMax;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenFirstMax() {
        int result = MultiMax.max(11, 4, 6);
        assertThat(result, is(11));
    }

    @Test
    public void whenThirdMax() {
        int result = MultiMax.max(1, 14, 22);
        assertThat(result, is(22));
    }

    @Test
    public void whenAllEqual() {
        int result = MultiMax.max(5, 5, 5);
        assertThat(result, is(5));
    }
}