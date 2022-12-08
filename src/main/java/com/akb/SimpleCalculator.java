package com.akb;

public class SimpleCalculator {

    public int addNumber(int number1, int number2){
        return number1 + number2;
    }

    public int sustract(int number1, int number2){
        if (number1 > number2){
            return number1 - number2;
        } else if (number1 == number2){
            return 0;
        } else {
            return number2 - number1;
        }
    }

    public int multiple(int num1, int num2){
        return num1 * num2;
    }
}
