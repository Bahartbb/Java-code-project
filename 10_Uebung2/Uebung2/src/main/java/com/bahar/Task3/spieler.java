package com.bahar.Task3;

public class spieler {

    public static void main(String[] args) {
        gibGegenstand();
        hebeAuf();
        betrachte();
        benutzeMit();

    }

    boolean befindetSichAmOrt;
    int anzahlGesammelterGegenstände;

    public static void gibGegenstand(){
        System.out.println("the method name is gibGegenstand");
    }


    public static void hebeAuf(){
        System.out.println("the method name is hebeAuf");
    }

    public static void betrachte(){
        System.out.println("the method name is betrachte");

    }

    public static void benutzeMit(){
        System.out.println("the method name is benutzeMit");

    }

    //Task5: mikhaym ke tebghe soal, yek method az jense kelase Object injad konim, ke yek object ro give mikone

    public Object gibgegenstand(){
        return new  Object();
    }

    public Object betrachte2(){
        return new  Object();
    }
}
