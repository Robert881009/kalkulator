package com.example.kalkulator;

public class Calculator {
    int result;

    public void addition(int a, int b){
        result = a + b;
        System.out.println(result);
    }
    public void subtraction(int a, int b){
        result = a - b;
        System.out.println(result);
    }
}
class Main{
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.addition(10,5);
        calculator.subtraction(25,8);
    }
}
