package com.bahar.UeberschreibenVonMethoden;

public class Kreis2 extends Kugel{

    public Kreis2(double radius){
        super(radius);

    }

    @Override
    public void zeichne() {
        super.zeichne();   //chon marhale 2vome ersbari hast, mituni az pedare aslie khodet (Kugel) mituni super biari, mituni nayari
                            //alan age run koni ham ino print mikone (az sout classe Kugel)
        System.out.println("Kreis2 is designed");  //ham ino az classe khodesh print mikone
    }


    public static void main(String[] args) {

        Kreis2 kreis2 = new Kreis2(12.09);

        kreis2.zeichne();
    }
}
