package com.cognizant.week2.aaa_pattern;

public class Mathutils {

    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0)
            throw new ArithmeticException("Division by zero");
        return a / b;
    }

    public boolean isPositive(int number) {
        return number > 0;
    }
}
