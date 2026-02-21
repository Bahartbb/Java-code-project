package com.bahar;

import java.awt.*;

public class Practice {


    // Aufgabe 1:

    String marke;
    String klasee;
    Color lackfarbe;
    float preis;

    int PS_zahl;
    int baujahr;
    int tueren;
    int hoechstgeschwindigkeit;
    int emission;

    boolean gruenePlakatte;
    boolean guetigerTuev;
    boolean katalysor;


    //Aufgabe 2:

//1-
//float ökowagen = emission < 120;
       boolean ökowagen = emission < 120;


//2-
//boolean dreituerer == tueren = 3;
        boolean dreituerer = tueren == 3;


//3-
//boolean x = auto.PS_zahl <> 200;
    Practice auto = new Practice();     //ham baray eauto objevt sakhtim ham <> ro taghir dadaim
    boolean x = auto.PS_zahl != 200;


//4-
//int motor = 4.2;
    double motor = 4.2;


//5-
//Boolean niceCar = preis < 20000 && farbe == Color.yellow || farbe == Color.green;
    Boolean niceCar = (auto.preis < 20000) && (auto.lackfarbe == Color.yellow || auto.lackfarbe == Color.green);



//6-
//int beschleunigung = 12
//int geschwindigkeit = 0;
//geschwindigkeit += geschwindigkeit + beschleunigung;

    //baraye inke += javab bede, hatman bayad dar yek method nevsehste beshe.


    int beschleunigung = 12;  //hatman in ro biroone method tarif karde ke dakhele method behesh dastresi nadashte va ba sakhtane object bhesh dasresi peyda karde

    public static void plusEquals() {


        Practice auto = new Practice();

        int geschwindigkeit = 0;
        geschwindigkeit += auto.beschleunigung;
    }


    //Example of 6:

        int a = 4;

    public static void multiEquals(){

        Practice practice = new Practice();

        int b = 2;
        practice.a *= b;

    }

    //7-
    // string modell = "Golf";

    String modell = "Golf";


    //8-
    //boolean guterJahrgang = baujahr > 1998 & baujahr <= 2000;

        boolean guterJahrgang = baujahr >= 1998 && baujahr <= 2000;


    //9-
    //Der Preis des Autos lässt sich glatt durch 36 teilen:
    //boolean ratenZahlung = preis / 36 == 0;


    //Practice auto = new Practice();    //onject ro aval misazi ke betooni azash estefade koni
    boolean ratenZahlung = (auto.preis % 36) == 0;



    //10-
    //Aufgrund eines Angebotes verringert sich der Preis des Autos
    //int preis = 30000;
    //int nachlass = 5000;
    //int preis = preis – nachlass;

    public static void newPrice(){

        int preis = 30000;
        int nachlass = 5000;
        preis -= nachlass;
        System.out.println(preis);
    }






    //-------------------------------------------------------------------------------------------------------------


    //Task3

    static int aktuellePassagiere = 0;
    static int maximalPassagiere = 4;
    static int gesamtzahlBefoerdertePassagiere = 0;


    public static void einsteigen(){


        if(aktuellePassagiere < maximalPassagiere){
            aktuellePassagiere++;
            maximalPassagiere++;
            System.out.println("a new passenger has been boarded");
        } else {
            System.out.println("the capacity of car is full");
        }



    }

    public static void befoerdertePassagiere(){
        if(aktuellePassagiere>0){
            aktuellePassagiere--;
            System.out.println("passengers are getting out of the car");
        } else {
            System.out.println("das Auto ist leer");
        }

    }

    public static void farbe(){

        String[] farbe = {"Bordeaux" , "Kobalt"};
        String a = farbe[1];
        switch(a){

            case "Bordeaux":
                System.out.println("Tolles Rot");
                break;

            case "Kobalt":
                System.out.println("Schoenes Blau");
                break;

            default:
                System.out.println("unbekannte Farbe");
                break;
        }

        }



        //Task4:
        //1-

    public static String verbindeString(String a, String b){

        return a + b;
    }


    public static String verbindeString2(String a, String b){

        String verbindung = a.concat(b);
        return verbindung;
    }


    public static String verbindeString3(String a, String b){

        StringBuilder verbindung2 = new StringBuilder();
        verbindung2.append(a).append(b);
        return verbindung2.toString();

    }


    //2-

    public static boolean aIstGleichB(String a, String b){

        boolean gleich = a.equals(b);
        return gleich;
    }


    //3-

    public static String aIstKleinerAlsB(String a, String b){

        if(a.length() < b.length()){
            return "a ist kleiner als b";
        } else if (a.length() == b.length()) {
            return "a ist gleich b";
        } else {
            return "b ist kleiner als a";
        }
    }




    //4- returns the character of the string at position.

    public static char holeZeichenAnPosition2(String input, int position){

        //ye string behet midam, position felan character ro az in string moshakhas kon

        //aval sharayete lazem ro barresi mikonim, mese inke String ya voroodi ya input null nabashan, ya inke position hichvaght kamtar az 0 nabashe, yani hamoon index, ya position bozorgatr az length input nabashe

        if(position < 0 || input == null || position >= input.length()){
            throw new IllegalArgumentException("invalid position or null String");  //inja etebar sanji kard va did yeki az sharthaye bala bargharare, va throw kard new illegal ro
        } else {
            return input.charAt(position);
        }
    }



    //5-
    //ye reshte dade mishe be name input ke daryaft mikoni, bakhshi az stringe dade shode beyne 2ta seperator gharar dare,in vasat ke beyne 2ta separator gharar dade ro yek ghsmatisho begiri jash char dige bezari
    //string[] moarefi mikonim, chon mikhaym ye mahdoode az yek inpute jense string ro made nazar gharar bedim az array estefade mikonim, parts ye khoone az hafezw hast

    public static String ersetzeMitte(String input, char trenner){

         String[] parts;       //ye array az jense string be esme parts doros mikonim
         parts = input.split(String.valueOf(trenner));       //input voroodie in array ro ba trenner az ham joda mikonim, chon trenner char hast ba String.valueOf() be String tabdil mikonim
        if(parts.length < 3) {
            return input;
        } else {
            String middle;
            middle = parts[1].replace("a" , "X");
            return parts[0] + middle + parts[2];
        }


    }




    //6-
    public static int addition(int a, int b){

        return a + b;
    }


    //7-
    public static int subtraktion(int a, int b){

        return a -b;
    }


    //8-
    public static int multiplikation(int a, int b){

        return a * b;
    }


    //9-
    public static int quersumme(int a){

        a = Math.abs(a);
        int sum = 0;
        while(a > 0) {
            sum += a % 10;
            a /= 10;
        }
        return sum;
    }

    public static int millionaer(double startkapital, double zinssatz){

        int Jahr =0;
        double rate = zinssatz/100;
        while(startkapital < 1_000_000){
            startkapital += rate * startkapital;
            Jahr++;
        }
        return Jahr;

    }



    public static void main(String[] args) {

        newPrice();
        einsteigen();
        befoerdertePassagiere();
        farbe();

        System.out.println(verbindeString("u" , "z"));
        System.out.println(verbindeString2("x", "y"));
        System.out.println(verbindeString3("c", "k"));

        System.out.println(aIstGleichB("h"  , "uh"));  //false
        System.out.println(aIstGleichB("ok" , "no")); //false
        System.out.println(aIstGleichB("ok" , "ok")); //true

        System.out.println(aIstKleinerAlsB("ok" , "no"));       //a = b
        System.out.println(aIstKleinerAlsB("i", "you"));       //a < b
        System.out.println(aIstKleinerAlsB("they" , "are"));  //b < a


        System.out.println(holeZeichenAnPosition2("bahar", 2));
        System.out.println(holeZeichenAnPosition2("bahar", 4));
        System.out.println(holeZeichenAnPosition2("bahar", 0));


        System.out.println(ersetzeMitte("yaaaaaaaay:axaxaxaxa:yaaaaaaay", ':'));
        System.out.println(ersetzeMitte("bahar;bahar;bahar" , ';'));


        System.out.println(quersumme(123));
        System.out.println(quersumme(-123));


        System.out.println(millionaer(500_000, 23));
        System.out.println(millionaer(500_000, 5));




    }

    }











