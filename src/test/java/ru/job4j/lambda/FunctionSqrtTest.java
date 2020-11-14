package ru.job4j.lambda;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.lambda.FunctionSqrt;

import static org.junit.Assert.*;

public class FunctionSqrtTest {

    @Test
    public void calculate() {
        Assert.assertEquals(2, FunctionSqrt.calculate(4), 0.01);
        assertEquals(3, FunctionSqrt.calculate(9), 0.01);
    }
}