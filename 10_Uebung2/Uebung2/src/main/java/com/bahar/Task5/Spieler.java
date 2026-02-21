package com.bahar.Task5;

public class Spieler {

    boolean befindetSichAmOrt;
    int anzahlGesammelterGegenstände;


    public static void gibGegenstand1(){
        System.out.println("The nethod name is gibGegenstand1");
    }


    public static void hebeAuf(){
        System.out.println("The nethod name is hebeAuf");
    }

    public static void betrachte(){
        System.out.println("The nethod name is betrachte");
    }

    public static void benutzeMit(){
        System.out.println("The nethod name is benutzeMit");
    }

    //Task5: mikhaym ke tebghe soal, yek method az jense kelase Object injad konim, ke yek object ro give mikone

    public Object gibGegenstand(){
        return new Object();
    }

    public Object btrachte(){
        return new Object();
    }

    public void benutzeMit(Gegenstand andereGegenstand){

    }



}
