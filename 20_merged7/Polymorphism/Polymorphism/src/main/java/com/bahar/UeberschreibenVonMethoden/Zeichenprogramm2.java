package com.bahar.UeberschreibenVonMethoden;

public class Zeichenprogramm2 {

    public static void main(String[] args) {

        Kreis2 kreis2 = new Kreis2(10.0);
        polymorphTest2(kreis2);
    }


    public static void polymorphTest2(Figur figur){

        double flaeche = figur.gibFlaeche();
        System.out.println(flaeche);
    }
}
