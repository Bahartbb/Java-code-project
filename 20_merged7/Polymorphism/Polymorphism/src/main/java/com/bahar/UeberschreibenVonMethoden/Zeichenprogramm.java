package com.bahar.UeberschreibenVonMethoden;

public class Zeichenprogramm {

    public static void main(String[] args) {
        //hadaf mohasebeye masahate Kreis hast, ke baraye in kar bayad aval ye method payin ijad konim

        Kreis kreis = new Kreis(10);
        polymorphTest(kreis);

        //hadaf mohasebeye masahate Kugel hast, ke baraye in kar bayad aval ye method payin ijad konim

        Kugel kugel = new Kugel(20);
        polymorphTest(kugel);

    }


    //mikhaym yek method dar methode main ijad konim baraye
    static void polymorphTest (Figur figur) {
        double flaeche = figur.gibFlaeche();
        System.out.println(flaeche);
    }

}
