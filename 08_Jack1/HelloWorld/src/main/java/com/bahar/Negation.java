package com.bahar;

//In dieser Aufgabe wird die Negation von Zahlen behandelt.
// Ziel der Aufgabe ist es, das Vorzeichen einer gegebenen Zahl zu ändern.

public class Negation {

    public static void main(String[] args) {
        System.out.println(negierung(2));
        System.out.println(negierung(12));
    }


    public static int negierung(int num){
        return -num;
    }
}
