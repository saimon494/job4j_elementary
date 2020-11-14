package ru.job4j.comparator;

import org.junit.Assert;
import org.junit.Test;

import java.util.Comparator;

import static org.junit.Assert.*;

public class NaturalOrderTest {
    @Test
    public void test() {
        Assert.assertEquals(Comparator.naturalOrder(), ru.job4j.comparator.NaturalOrder.naturalOrder());
    }
}