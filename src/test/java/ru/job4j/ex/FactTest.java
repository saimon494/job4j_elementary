package ru.job4j.ex;

import org.junit.Test;
import ru.job4j.ex.Fact;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenNLessThen0() {
        Fact.calc(-4);
    }

    @Test
    public void when4Then24() {
        int rsl = Fact.calc(4);
        assertThat(rsl, is(24));
    }
}