package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        int expected = 2;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when12to42then3() {
        Point a = new Point(1, 2);
        Point b = new Point(4, 2);
        int expected = 3;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when815to83then20() {
        Point a = new Point(8, 15);
        Point b = new Point(-8, 3);
        int expected = 20;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}