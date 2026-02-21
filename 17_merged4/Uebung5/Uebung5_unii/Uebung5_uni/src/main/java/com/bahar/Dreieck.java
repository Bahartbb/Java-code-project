package com.bahar;

public class Dreieck extends GeometrischeFigur {

    private double hoehe;
    private double grundseite;


    //chon darim az GeometrischeFigur ers mibarim bayad constructoresh ham be ers bebarim
    //constructore classe farzand, har voroodi bekhad mitune begire az variable haye khodesh
    //az kalame super bayad estefade beshe, ta betune anche ke dar constructore pedar dar body umade ro be ers bebare

    public Dreieck(double hoehe , double grundseite){
        super(0.5*hoehe*grundseite);
        this.hoehe = hoehe;
        this.grundseite = grundseite;

    }


    //mikhaym bebini classe Dreieck yek nemoone az object hast ya na
    //tooye methode equals baraye object, return kon ke aya Dreieck nemoonei az Object hast ya na
    //soal khaste: aya class Kreis, Rechteck va Dreieck jenseshon ya typeshoon mesle clase Object hastan ya nistan(primitive data type hastan)
    //moghayeseye 2 Object ke gofte, yeki classe Object asliye java va digari classe Dreieck ke toosh hastim

    public boolean equals(Object obj){   //yek voroodi migire az jense classe Object va ye esm (obj) ham vasash mizarim
        return (obj instanceof Dreieck) &&
                (((Dreieck)obj).hoehe == this.hoehe) &&
                (((Dreieck)obj).grundseite == this.grundseite); //azoonjayi ke Dreieck noei az class Object hast, va az tarafi Object hoehe/grundseite nadare, mitunim inja ba amale cast kardan
                                                                //be moteghayer haye aan dastresi dashte bashim

    }
}
