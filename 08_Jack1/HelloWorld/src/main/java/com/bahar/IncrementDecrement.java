package com.bahar;

//Hier werden die Operationen + und - verwendet.
// Man soll in dieser Aufgabe Zahlen inkrementieren bzw. dekrementieren können.
// Das bedeutet, man soll eine gegebene Zahl um 1 erhöhen bzw. verringern.

public class IncrementDecrement {

    public static void main(String[] args) {
        System.out.println(increment(10));
        System.out.println(increment(40));
        System.out.println(increment(27));
        System.out.println(increment(30));
        System.out.println(decrement(10));
        System.out.println(decrement(43));
        System.out.println(decrement(28));
        System.out.println(decrement(37));

    }

    //bayad method baraye increment va decrement benvisim

    public static int increment(int num){
        int result = num + 1;
        return result;

        //ya kollan faghat minveshti:
        // return num +1;
    }

    public static int decrement(int num){
        int result = num - 1;
        return result;

        //ya kollan faghat minveshti:
        // return num -1;
    }
}
