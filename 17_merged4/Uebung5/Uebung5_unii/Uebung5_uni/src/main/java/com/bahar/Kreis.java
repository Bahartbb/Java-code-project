package com.bahar;

//extend mikone az GeometrischeFigur, chon mikhad az ye classe abstract be ers bebare, pas contructore un ham be ers mibare
public class Kreis extends GeometrischeFigur {

    private double radius;


    //chon darim az GeometrischeFigur ers mibarim bayad constructoresh ham be ers bebarim
    //constructore classe farzand, har voroodi bekhad mitune begire az variable haye khodesh
    //az kalame super bayad estefade beshe, ta
    public Kreis(double radius) {
        super(radius*radius*Math.PI);       //vaghti ye class dare az ye classe abstract be ers mibare, baraye ijade rabete az keyworde super estefade mishe
        this.radius = radius;                                                   //dar vaghe miyad haranche ke dar const. pedar bud ro miyare
    }


    //mikhaym bebini classe Kreis yek nemoone az object hast ya na
    //tooye methode equals baraye object, return kon ke aya Kreis nemoonei az Object hast ya na
    //soal khaste: aya class Kreis, Rechteck va Dreieck jenseshon ya typeshoon mesle clase Object hastan ya nistan(primitive data type hastan)
    //moghayeseye 2 Object ke gofte, yeki classe Object asliye java va digari classe Kreis ke toosh hastim

    public boolean equals(Object obj) {  //yek voroodi migire az jense classe Object va ye esm (obj) ham vasash mizarim
        return (obj instanceof Kreis) &&   //aya kreis nemoonei az Object hast
                ((Kreis)obj).radius == this.radius;  //taking into account the corresponding dimensions of the geometric figures.
                                                     //chon obj typesh Object hast, bayad cast konim be type e un classi ke darim bahash moghayese mikonim
                                                    //azoonjayi ke Kreis noei az class Object hast, va az tarafi Object radius nadare, mitunim inja ba amale cast kardan
                                                    //be moteghayer haye aan dastresi dashte bashim
    }
}
