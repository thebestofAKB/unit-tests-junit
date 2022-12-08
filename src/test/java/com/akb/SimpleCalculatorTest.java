package com.akb;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleCalculatorTest {

    private SimpleCalculator calculator = new SimpleCalculator();

    @Test
    public void addNumberTest(){
        assertEquals(6, calculator.addNumber(2, 4));
    }

}
