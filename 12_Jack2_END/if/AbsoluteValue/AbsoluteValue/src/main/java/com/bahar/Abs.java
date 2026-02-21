package com.bahar;


public class Abs
{
    public static void main( String[] args )
    {
        System.out.println(abs(-24));
        System.out.println(abs(0));
        System.out.println(abs(4));
        System.out.println(abs(-100));
        System.out.println(abs(-222));

    }

    public static int abs(int value){

        if(value < 0){
            value = -value;
            System.out.println("the absolute value of given number is: ");
            return value;
        }

        if(value > 0){
            value = +value;
            System.out.println("the absolute value of given number is: " + value);
            return value;
        }

        if(value == 0)
            System.out.println("the absolute value of given number is: " + value);
            return 0;

    }



}
