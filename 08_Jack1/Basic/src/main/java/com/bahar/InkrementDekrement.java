package com.bahar;

public class InkrementDekrement {

    /*
     * Diese Methode soll die Zahl zahl inkrementieren, das heisst um 1 erhoehen,
     * und zurueckgeben.
     *//*
    public static int inkrementiere(int zahl) {
        return zahl+1;//zu bearbeiten
    }

    *//*
     * Diese Methode soll die Zahl zahl um 1 dekrementieren, das heisst um 1 erniedrigen,
     * und zurueckgeben.
     *//*
    public static int dekrementiere(int zahl) {
        return zahl-1;//zu bearbeiten
    }

    //Die main Methode zum Testen der Methoden. Du kannst auch eigene Testfaelle testen.
    public static void main(String[] args) {
        System.out.println(inkrementiere(42));//Erwartet:43
        System.out.println(inkrementiere(27));//Erwartet:28
        System.out.println(inkrementiere(30));//Erwartet:31
        System.out.println(dekrementiere(43));//Erwartet:42
        System.out.println(dekrementiere(20));//Erwartet:19
        System.out.println(dekrementiere(37));//Erwartet:36
    }*/


    //increment:
    public static int increment(int number){
        return number+1;
    }


    //decrement
    public static int decrement(int number){
        return number-1;
    }

    public static void main(String[] args) {

        System.out.println(increment(12));
        System.out.println(decrement(12));
        System.out.println(increment(34));
        System.out.println(decrement(34));
        System.out.println(increment(25));
        System.out.println(decrement(25));

    }
}
