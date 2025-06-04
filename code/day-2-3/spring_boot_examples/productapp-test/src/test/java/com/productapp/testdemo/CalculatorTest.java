package com.productapp.testdemo;

import com.productapp.demo.Calculator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator ;

    @BeforeEach
    public void setUp() throws Exception {
        calculator=new Calculator();
    }
    @DisplayName("Addition Test")
    @Test
    void addTest() {
        assertEquals(10,calculator.add(5,5));
    }

    @EnabledOnOs({OS.MAC,OS.LINUX})
    @DisplayName("Mul Test")
    @Test
    void mulTest() {
        assertEquals(25,calculator.mul(5,5));
    }

    @DisplayName("Divide Positive Test")
    @Test
    void divideTestPostive() {
        assertEquals(1,calculator.divide(5,5));
    }

    @DisplayName("Divide Negative Test")
    @Test
    void divideTesNegative() {
        assertThrows(ArithmeticException.class,()->calculator.divide(5,0),"Cannot divide by zero");
    }
    @AfterEach
    public void tearDown() throws Exception {
        calculator=null;
    }

}