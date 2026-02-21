package com.bahar;

public class Calculator {
   // This is about a simple implementation of a calculator.
    // This calculator should only know the basic arithmetic operations +,-,*,/.

    public static void main(String[] args) {
        System.out.println(sum(4,6));
        sub(4,6);
        System.out.println(multiply(4,6));
        division(4,6);
    }

    public static double sum(double a, double b){
        double result = a + b;
        return result;
        // return a + b;
    }

    public static double sub(double a, double b){
        double result = a - b;
        System.out.println("the subtraction is: " + result);
        return result;
    }

    public static double multiply(double a, double b){
        return a * b;
    }

    public static double division(double a, double b){
        double result = a / b;
        System.out.println("the division is: " + result);
        return result;
    }
}
