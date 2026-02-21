package com.bahar;

public class Practice {

    public static void main(String[] args) {

        System.out.println(checkNumber(20));
        System.out.println(checkNumber(21));
    }



    public static boolean checkNumber(int num) {
        if (num % 2 == 0) {
            System.out.println("the given number is even: ");
            return true;
        } else {
            System.out.println("the given number is odd: ");
            return false;
        }
    }
}
