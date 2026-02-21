package com.bahar;

public class Nutzer {

    public static void main(String[] args) {

        Obst obst = new Obst();
        // int gewicht = obst.gewicht;   nicht erlaubt
        //boolean reif = obst.istReif;   nur wenn in einem Paket sind
        boolean geniessbar = obst.istGeniessbar();


        Banane banane = new Banane(true);
        //banane.istReif;  // bayad inja dar yek khoone hafezae moarefi beshe
        //yani be in shekl:     boolean istReif = banane.istReif;
        banane.istGeniessbar();   //return false

    }
}
