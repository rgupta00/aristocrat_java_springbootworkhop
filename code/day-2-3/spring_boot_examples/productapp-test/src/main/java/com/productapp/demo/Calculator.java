package com.productapp.demo;

public class Calculator {
    public int add(int a, int b) {
        return a+b;
    }

    public int mul(int a, int b) {
        return a*b;
    }

    public int divide(int a, int b) {
        if(b==0)
            throw new ArithmeticException("Cannot divide by zero");
        return a/b;
    }
}
