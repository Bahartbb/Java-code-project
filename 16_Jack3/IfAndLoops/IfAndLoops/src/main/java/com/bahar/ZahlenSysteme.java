package com.bahar;
//aval az hame yek String darim ke mikhaym bbinim aya mishe be onvane yek adad dar system haye adadie khas morede barresi gharar girad.(pass shodan)
//

public class ZahlenSysteme {

    public static boolean istDualZahl(String zahl){

        return zahl.matches("[01]+");
    }



    public static boolean istDezimalzahl(String zahl){

        return zahl.matches("[0-9]+");
    }



    public static boolean istHexadezimalzahl(String zahl){

        return zahl.matches("[0-9A-F]+");
    }



    public static boolean istOktalzahl(String zahl){

        return zahl.matches("[0-7]+");
    }








    public static void main(String[] args) {

        System.out.println(istDualZahl("123"));
        System.out.println(istDualZahl("1000101"));

        System.out.println(istDezimalzahl("1"));
        System.out.println(istDezimalzahl("32b"));
        System.out.println(istDezimalzahl("32"));


        System.out.println("HexaDecimal: " + istHexadezimalzahl("12F"));
        System.out.println("HexaDecimal: " + istHexadezimalzahl("12"));
        System.out.println("HexaDecimal: " + istHexadezimalzahl("E"));
        System.out.println("HexaDecimal: " + istHexadezimalzahl("abcdef"));  //faghat ABCDEF bozorg


        System.out.println("Oktal: " + istOktalzahl("67"));
        System.out.println("Oktal: " + istOktalzahl("78"));
        System.out.println("Oktal: " + istOktalzahl("1234567"));
        System.out.println("Oktal: " + istOktalzahl("12A45"));



    }
}
