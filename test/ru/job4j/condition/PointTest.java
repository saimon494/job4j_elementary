package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        int expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when12to42then3() {
        int x1 = 1;
        int y1 = 2;
        int x2 = 4;
        int y2 = 2;
        int expected = 3;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when815to83then20() {
        int x1 = 8;
        int y1 = 15;
        int x2 = -8;
        int y2 = 3;
        int expected = 20;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}