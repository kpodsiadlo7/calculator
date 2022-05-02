package com.kodilla.calculator;

public class Calculator {

    public void addMethod(){
        System.out.println("Adding value");
    }

    public void substractMethod(){
        System.out.println("Subtraction value");
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        calculator.addMethod();
        calculator.substractMethod();

    }
}
