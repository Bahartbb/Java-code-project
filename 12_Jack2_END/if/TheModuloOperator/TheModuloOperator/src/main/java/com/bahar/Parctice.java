package com.bahar;

public class Parctice {

    public static void main(String[] args) {

        System.out.println("num1 is divisible by num2: " + divisible(12,6));
        System.out.println("num1 is not divisible by num2: " + divisible(15,7));


    }

    public static boolean divisible (int num1 , int num2){

        if (num1 % num2 == 0 ){
            return true;
        } else{

        }
        return false;
    }
}
