package com.bahar;

public class Bankomat {

    private static ECKarte karte = new ECKarte("max Mustermann" , 1234 , 1000.00);



    public static void main(String[] args) {

        System.out.println(karte.gibKontostand(0234));;  //falsche PIN
        System.out.println(karte.gibTransaktionen(1234));

    }
}
