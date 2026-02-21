package com.bahar;

public class Rechteck extends GeometrischeFigur{

    private double laenge;
    private double breite;

    //chon darim az GeometrischeFigur ers mibarim bayad constructoresh ham be ers bebarim
    //constructore classe farzand, har voroodi bekhad mitune begire az variable haye khodesh
    //az kalame super bayad estefade beshe, ta

    public Rechteck(double laenge, double breite){
        super(laenge*breite);
        this.breite = breite;
        this.laenge = laenge;

    }


    //mikhaym bebini classe Rechteck yek nemoone az object hast ya na
    //tooye methode equals baraye object, return kon ke aya Rechteck nemoonei az Obhect hast ya na
    //soal khaste: aya class Kreis, Rechteck va Dreieck jenseshon ya typeshoon mesle clase Object hastan ya nistan(primitive data type hastan)
    //moghayeseye 2 Object ke gofte, yeki classe Object asliye java va digari classe Rechteck ke toosh hastim

    public boolean equals(Object obj){   //yek voroodi migire az jense classe Object va ye esm (obj) ham vasash mizarim
        return (obj instanceof Rechteck) &&
                (((Rechteck)obj).laenge == this.laenge) &&
                (((Rechteck)obj).breite == this.breite); //azoonjayi ke Rechteck noei az class Object hast, va az tarafi Object laenge/breite nadare, mitunim inja ba amale cast kardan
                                                        //be moteghayer haye aan dastresi dashte bashim
    }

}
