package com.bahar;


public class Rechteck
{
    int breite, hoehe;

    public Rechteck(int breite, int hoehe){
        this.breite = breite;
        this.hoehe = hoehe;
    }

    //override kardane toString be in dalile ke betunim object ro print konim,
    //yani be zabane ensan tabdil konim ke maghadire object ro betoonim bekhoonim
    //kollan age ye object az class besazim va bekhaym obj ro print konim, har chi ke be
    //methode toString dar return dade bashim, uno print mikone
    public String toString(){
        return "Breite: " + breite + "Hoehe:" + hoehe;
    }


    public static void main( String[] args )
    {
        Rechteck rechteck = new Rechteck(5 , 10);
        System.out.println(rechteck);
    }
}
