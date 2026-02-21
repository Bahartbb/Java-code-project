package com.bahar.UeberschreibenVonMethoden;

public class Kugel extends Kreis{

    //constructor (ejbari): jahayi ke esr bari (extend) vojood dare beyne 2 class be in mani hast ke kelase farzand
    // az kelase pedar ers mibare, yani ke be member haye classe pedar mitune darsresi daste bashe,
    //va super yeki az aanhast, bayad super ro dar constructore farzand biari va voroodie constuctore pedar ro
    //dar super benevisi


    public Kugel(double radius) {   //voroodie constructore pedar ro migire
        super(radius);  //voroodie constructore pedar dar super dar classe farzand miad
    }



    //halati ke mikhaym method haye subclassi ke be esr bordim ro override konim ta betunim taghirati ke mikhaym
    //dar body bedim

    @Override
    public void zeichne() {
        System.out.println("Kugel is designed");

    }

    @Override
    public double gibFlaeche() {
        return 4 * super.gibFlaeche();  //yani ba super har anche ke dar return in method dar class pedar anjam shod ro zarbdar 4 kon
    }



    //in dar sooratie ke khode extend methodhaye classe subclass ro be ersm mibare
   /* public static void main(String[] args) {

        Kreis kreis = new Kreis();

        kreis.zeichne();
        kreis.gibFlaeche();
    }*/
}
