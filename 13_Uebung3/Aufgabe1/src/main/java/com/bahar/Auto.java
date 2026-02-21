package com.bahar;


import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.awt.*;
import java.util.Arrays;

public class Auto {
    String marke;  //1,9-brand
    String klasse; // 5,9- class
    //String lackfarbe;   bekhatere taske 2 shomare 5 avaz shod be Color
    Color lachFarbe; // 9- color
    float preis; //9- price
    int ps;   //2- psNumber
    int tueren;  //4,6- doors
    int Hoechstgeschwindigkeit;  //6- highestSpeed
    int bauJahr;  //5,7,9- constructionYear
    int emission; // 8- horsepower figure

    boolean Katalysor; //10- CatalyticConverter
    boolean gueltigTuevSiegel;   //3,10- ValidMotSeal
    boolean gruenePlakatte; //3,5- greenSticker


    //Task 2:

    // float oekoWagen = emission < 120;  //false
        boolean oekoWagen = emission < 120;

    //boolean dreiTueren == tueren = 3;   //fasle
        boolean dreiTueren = 3 == tueren;

        //Auto auto = new Auto();  //object az classe Auto bayad misakhtim
        //boolean x = auto.ps <> 200;
        //boolean x = auto.ps != 200;

    //int motor = 4.2;   //fasle
        float motor = 4.2f;
        double motor1 = 4.2;

    //Boolean niceCar = preis < 20000 && farbe == Color.yellow ||farbe == Color.green;
    boolean niceCar = (preis < 2000) && ((lachFarbe == Color.yellow) || (lachFarbe == Color.green));
    //bala classe String baraye lacfarbe be Color taghir peyda kard

    //boolean niceCar = preis < 2000 && lachFarbe == Color.yellow || lachFarbe == Color.green;
    //braces faghta baraye tamiziye kar hastan


    int beschleunigung = 12;    //rahe 1:  miay ya variable ha ro inja moarefi mikoni va payin ba object sakhtan call mikoni
    int geschwindigkeit = 0;
    // geschwindigkeit += geschwindigkeit + beschleunigung;  //bayad geschwindigkeit hazf beshe va dar method neveshte beshe







    //string modell = “Golf“;
    //String modell = "Golf";

    //boolean guterJahrgang = baujahr > 1998 & baujahr <= 2000;
    boolean guterJahrgang = bauJahr >= 1998 && bauJahr <= 2000;



    boolean ratenZahlung = (preis % 36) == 0;   //age bekhaym dar badane main bekar bebarim, bala


    //uamdi too sathe classe ye 2ta variable moarefi kardi, vali mikhay inja mohasebat anjam bedi
    //calculations faghat dar dakhele method anjam mishe, inja main darim, dar main minevisim
    //int preis1 = 30000;
    //int nachlass = 5000;
    //preis1 = preis1 – nachlass;


//-------------------------------------------------------------------------------------------------------------------

//Task 3:

    static int aktuellPassagiere = 0;     //current
    static int maximalPassagiere = 5;     //maximumPassagngers
    static int gesamstZahlPassagiere = 0;   //total


    //boarding
    public static void einsteigen(){

        if(aktuellPassagiere < maximalPassagiere){
            aktuellPassagiere++;
            gesamstZahlPassagiere++;
            System.out.println(aktuellPassagiere + ":" + "a new passanger has been boarded");  //bala dar main call kon
        }else {
            System.out.println("the capacity of car is full");
        }

    }


    //getOut
    public static void aussteigen(){

        if(aktuellPassagiere > 0){
            aktuellPassagiere--;
            System.out.println("passengers are getting out of the car");
        } else {
            System.out.println("the car is empty");
        }
    }

    public static void befoerdertePassagiere(){

        System.out.println("the maximum number of transported passangers:" + gesamstZahlPassagiere);
    }

    public static void farbe(){

        String[] lackfarbe = {"Bordeaux" , "Kobalt"};
        String index = lackfarbe[1];
        switch (index){
            case "Bordeaux":
                System.out.println("Tolles rot");
                break;
            case "Kobalt":
                System.out.println("Schoenes Blau");
                break;
            default:
                System.out.println("Unbekannte Farbe");
                break;
        }
    }


    //Task 4:

    //1-

    //raveshe aval:
    public static String verbindeString(String a, String b){

        String verbindung = a.concat(b);   //inja az . estefade kardim ke berim dakhele classe a az jense String ke betunim concat kardan ro entekhab konim
        return verbindung;
    }

    //raveshe 2vom  ---> OSTAD
    public static String verbindeString2 (String a, String b){

        return a + b;
    }

    //raveshe 3vom:
    public static String verbindeString3 (String a, String b){

        StringBuilder verbindung2 = new StringBuilder();   //yek object az classe Stringbuilder misazim va..
        verbindung2.append(a).append(b);   //va dar payin az tarighe methode append variable ha ro concat mikonim
        return verbindung2.toString();   //az tarighe toString tabdil be String mikonim
    }

    //-----------------------------------------------------------------------------
    //2-

    //raveshe aval:
    public static boolean aIstGleichB(String a, String b){

        //raveshe aval:
        boolean gleich = a.equals(b);
        return gleich;

    }

    //raveshe dovom:
    public static boolean aIstGleichB2(String a, String b) {
        if (null != a)
            return a.equals(b);   //return kon aya (bolean) a mosavie b ast ya na, true false bede
        else
            return null == b;   //agar if nabud, 1 halate dg bishtar vojood nadare, yani natijeye null==b ro bargardoon
    }


    //-----------------------------------------------------------------------------
    //3-

    //raveshe aval:
    public static String aIstKleinerAlsB(String a, String b){

        if(a.length() < b.length()){
            return "a ist kleiner als b";
        } else {
            return "b ist kleiner als a";
        }
    }

    //raveshe 2vom (OSTAD)
    public static boolean aIstKleinerAlsB3(String a, String b) {
        if (null != a)
            return (0 > a.compareTo(b));  //ba method compare to miyad a ro ba b moghayese mikone, Fariba ba Najafi, ham index be index ham, harf be harf, F az N koochiktare, pas a.compereto b < 0 mishe, true mide
        //ma ebarate (0 > a.compareTo(b) ro be onvane javabe dorost mikhaym, chon a < b bayad bashe, age ino dad, true bede, pas in ba return true barabare, age na fasle bede, yani a > b
        else
            return false;
    }





    //tamrin:
    //aval tashkhis bede a az b koochiktare, age koochiktar bud, bar asase tartibe horoof ham yek moghayese anjam bede, bad dar nahayat concat kon a , b ro

    public static String aIstKleinerAlsB2 (String a, String b){

        if(a.length() < b.length()){
            if (a.compareTo(b) < 0){
                return ("second if satisfies: " + a + b);
            } else {
                return ("the second if does not satisfy");
            }
        } else {
            return ("length of a is not less than length of b");
        }
    }

    //-----------------------------------------------------------------------------

    //4-
    //raveshe aval:

    public static char holeZeichenAnPosition2(String input, int position){

        //ye string behet midam, position felan character ro az in string moshakhas kon

        //aval sharayete lazem ro barresi mikonim, mese inke String ya voroodi ya input null nabashan, ya inke position hichvaght kamtar az 0 nabashe, yani hamoon index, ya position bozorgatr az length input nabashe

        if(position < 0 || input == null || position >= input.length()){
            throw new IllegalArgumentException("invalid position or null String");  //inja etebar sanji kard va did yeki az sharthaye bala bargharare, va throw kard new illegal ro
        } else {
            return input.charAt(position);
        }
    }


    //raveshe 2vom(OSTAD)

    public static char holeZeichenAnPosition(String input, int position) {
        return input.charAt(position);
    }

    //-----------------------------------------------------------------------------


    //5-
    //ye reshte dade mishe be name input ke daryaft mikoni, bakhshi az stringe dade shode beyne 2ta seperator gharar dare,in vasat ke beyne 2ta separator gharar dade ro yek ghsmatisho begiri jash char dige bezari
    //string[] moarefi mikonim, chon mikhaym ye mahdoode az yek inpute jense string ro made nazar gharar bedim az array estefade mikonim, parts ye khoone az hafezw hast

    public static String ersetzeMitte(String input, char trenner){

        String[] parts;
        parts = input.split(String.valueOf(trenner));
        if(parts.length != 3) {
            return input;
        }
        String middle;
        middle = parts[1].replace('a', 'X');
        return parts[0] + middle + parts[2];
    }

    //raveshe 2vom(OSTAD):

    public static String ersetzeMitte2(String input, char trenner) {
        //ma mikhaym too in method ye kalameye 3 bakhshi (index) ro hade vasatesh ro ke ba separator az ham joda mishan ro peyda konim
        //sepas hameye horoofi ro k ba a nevehste shode dar bakhshe (index) vasat ba X jaygozin konim
        //inputs: String input ye reshte hast ke haviye hade aghal 2 ta charactere joda konandas (trenner)
        //trenner: ye charactere az jense char hast ke baraye joda sazie bakhshhaye mokhtalefe input estefade mishe

        //start va payan(stop) ro be soorate inke start ghable trennere aval va stop bade trennere 2vom gharar migire
        int start = input.indexOf(trenner , 0);  //ba methode inedxOf boro az tooye input, az khoonye(index) 0 shoroo kon,begard be trenner beres va trenner ro peyda kon, int start ham neshoon mide ke un trenner dar index chandome
        int stop = input.indexOf(trenner, start + 1); //start jayi bud ke trenner aval gharar dasht, pas az khooneye start + 1 shoroo kon be gashtan baraye trenner badi

        //hala mikhaym bakhshe vasat ro peyda konim ke betunim toosh jaye a ro ba X avaz konim
        String subStr = input.substring(start + 1 , stop);  //substring miyad bakhshe beyne indexe start +1 va indexe stop ro joda mikone, ke mishe hamun hadde vasat
        //chera start + 1: dalilesh ine ke taghirat daghighan bayad bad az trenner aval ta ghable trenner akhar emal beshe
        subStr = subStr.replace('a', 'X');
        return input.substring(0, start) + subStr + input.substring(stop + 1, input.length());  //input.length avaordim baraye jelo giri az hazfe character dar reshte


    }

    //mesal baraye darke behtare input.length() va input.substring() :
    public static void example(){

        String input2 = "apple,orange,banana";
        char seperator = ',';
        int start = 5;
        int stop = 12;

        System.out.println(input2.substring(start , input2.length()));  //mikhaym ,orange,banana ro bede, mige az start (5) shoroo kon, bad input2.length() mige baghieye text(badaaz start) harchi hast ro biar
        System.out.println(input2.substring(0 , stop + 1));   //mikhaym apple,orange, ro bede, pas az index 0 shoroo kon, ta stop + 1 boro

    }



    //-----------------------------------------------------------------------------
    //6-

    public static int addition(int a, int b){

        return a + b;
    }

    //7-
    public static int subtraction(int a, int b){

        return a - b;
    }

    //8-
    public static int multiplikation(int a, int b){

        return a * b;
    }


    //9-
    //majmooe arghame yek adad
    public static int quersumme(int a){

        a = Math.abs(a);   //a hamishe bayad mosbat bashe, maslan age -154 dad, bayad aval ba Math.abs tabdil be mosbat mikone 154 ro bad  argham ro jam mibande
        int sum = 0;
        while(a > 0){     // a ro bozorgtar az 0 mizarim ke hame argham ro dar nazar begire
            sum += a % 10;
            a /= 10;

        }
        return sum;
    }


    //ravehse 2vom(OSTAD)
    public static int quersumme2(int a){
        int quersumme = 0;   //vazifash zakhire sazie majmooe argham hast
        while(a != 0) {     //darim ye sharti ro barresi mikonim, mige in shart edame dare ta zamani ke a be 0 berese, yani a 0 beshe dg dakhele whule ejra nemishe
            quersumme += a % 10;     //inja baghimoonde a taghsim bar 10 be dast miad, yani akharin raghame adade a ro begir be quersumme ezafe kon
            a /= 10;    //ba inkar yek ragham ro az samte raste adade a hazf kon
        }
        return quersumme;
    }


    //10-
    public static int millionaer(double startKapital, double zinssatz){   //startingCapital    //intrestRate

        int Jahr = 0;
        double rate = zinssatz/100;    //darsade sood
        while (startKapital < 1_000_000){
          startKapital += rate * startKapital;   //startKalpital = startKapital + (rate * startKapital)
          Jahr++;

        }
        return Jahr;
    }


    //raveshe 2vom(OSTAD)

    public static double millionaer2(double startkapital, double zinssatz){
        //Zinsfaktor umrechnen
        double zinsfaktor = 1.0 + (zinssatz/100.0);   //nerkhe soodi ke bank elam mikone, mige neghad behet sood midam, ke nahayat ma pool ro zarb dare in mikonim

        //Auf das Jahr genaue iterative Lösung mit Zählschleife
        int jahre;     //chon khode soal khaste tedad salhayi ke tool mikeshe ro begu
        for(jahre=0; startkapital < 1000000; jahre++) {
            startkapital *= zinsfaktor;
        }
        return jahre;
    }







    public static void main(String[] args) {

        Auto auto1 = new Auto();
        auto1.geschwindigkeit += auto1.beschleunigung;
        //geschwindigkeit = geschwindigkeit + beschleunigung;


        //rahe 2: ya miay az aval inja variable moraefi mikoni, va edame ro minvisi, ke dg nemikhad object moarefi koni

        int beschleunigung2 = 12;
        int geschwindigkeit2 = 2;
        geschwindigkeit2 += beschleunigung2;
        System.out.println(geschwindigkeit2);




        //string modell = “Golf“;
        String modell = "Golf";

        //agar bekhad beporse ke halate true fasle in soal ro barresi kon
        boolean modell1 = modell == "Golf";



        Auto auto4 = new Auto();
        boolean ratenZahlung = (auto4.preis % 36) == 0;



        int preis1 = 30000;
        int nachlass = 5000;
        preis1 -= nachlass; //baraye - nemitunim az - khali estefade konim


        //Task 3:
        einsteigen();
        aussteigen();
        befoerdertePassagiere();
        farbe();

        //Task 4:

        System.out.println(verbindeString("x", "y"));;
        System.out.println(verbindeString2("u", "z"));
        System.out.println(verbindeString3("e", "f"));

        System.out.println(aIstGleichB("a" , "b"));
        System.out.println(aIstGleichB("a" , "a"));
        System.out.println(aIstGleichB2("Fariba", "Najafi"));

        System.out.println(aIstKleinerAlsB("t" , "g"));
        System.out.println(aIstKleinerAlsB("Ata" , "Bahar"));

        System.out.println(aIstKleinerAlsB2("ali" , "zare"));
        System.out.println(aIstKleinerAlsB2("Bahar" , "Ata"));

        System.out.println("on this position we have:  " + holeZeichenAnPosition2("Bahar", 2));
        System.out.println("on this position we have:  " + holeZeichenAnPosition2("Bahar", 3));
        System.out.println("on this position we have:  " + holeZeichenAnPosition2("Bahar", 0));


//        String input = "yaaaaaaaay:axaxaxaxa:yaaaaaaay";
//        char trenner = ':';
//        String result = ersetzeMitte(input,trenner);
//        System.out.println("output: " + result);
        System.out.println(ersetzeMitte("yaaaaaaaay:axaxaxaxa:yaaaaaaay", ':'));

        System.out.println(quersumme(125));
        System.out.println(quersumme(-112));
        System.out.println(quersumme(12));

        System.out.println(millionaer(500_000 , 23));



    }

}
