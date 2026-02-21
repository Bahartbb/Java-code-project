package com.bahar;

//yek classe jadid ijad kon, va classe GeometrischeFigur ro test kon
// va un 3 ta classe shape ha ham ba tavajoh be maghadiri ke beheshoon dade mishe test beshan



import java.util.Random;

public class TestGeometrie {   //class baraye teste masahat


    public static void main(String[] args) {


        //yek array az masahat misazim ke 3000 ta zarfiyat dare, yani 3000 ta masahat toosh ja mishe
        GeometrischeFigur[] geoArray = new GeometrischeFigur[3000];


        //mitoone 42 ta adade random tolid kone
        //tazmin mikoe adade tekrari tolid beshe
        //mtoone 42 ta adade tekrari dashte bashe ya 42 bar ye adad ro tekrar kone
        Random rnd = new Random(42);

        final int maxWert = 5;

        for (int i = 0; i < geoArray.length; i++) {

            //taghsim bare tedade sheklhaa
            switch (i % 3) {

                case 0:
                    geoArray[i] = new Dreieck(rnd.nextDouble() * maxWert, rnd.nextDouble() * maxWert);
                                                //dakhele parantez voroodi constructoresh miad
                case 1:
                    geoArray[i] = new Kreis(rnd.nextDouble() * maxWert);
                                            //dakhele parantez voroodi constructoresh miad
                case 2:
                    geoArray[i] = new Rechteck(rnd.nextDouble() * maxWert, rnd.nextDouble() * maxWert);
            }                                //dakhele parantez voroodi constructoresh miad

        }

        //dar edame ma bayad array geArray ro print konim, baraye in manzoor az ghabeliyate haghleye foreach estefade mikonim, baraye peymayesh dar Array ke ghablan ijad kardim
        //dar foreach miaym yek nemoone az Array ke ghablan ijad kardim, ijad mikonim, ba nam bordane Array-type, gozashtane esm barash, bad inke ar koja peymayesh kone, dar esme Array ke sakhtim
        //foreach : for(Arraye-type  esm bezar : esmeArray ){  }
        for (GeometrischeFigur figur : geoArray) {

            String name; //baraye zakhire kardane maghadire figur

            if (figur instanceof Rechteck) {
                name = "Rechteck";   //agar figur nemoonei az Rechteck bud, Recteck ro dar name gharar bede

            } else if (figur instanceof Dreieck) {
                name = "Dreieck";

            } else {
                name = "Kreis";
            }

            System.out.println("Ein " + name + " mit einer Fläche von " + figur.getFlaeche());
        }

        //3 ta shekl dashtim, ke harkodoom ye azlaei daran, dar nahatyat kare ma ine ke masahate har kodoom ro mojazza chap kone
        //baraye in kar bayad meghdare avaliye har shekl ro joda joda ijad konim
        //bayad ebteda meghdar dehi beshan, bayad dar ghalebe Array meghdar dehi beshe, chon ma darim dar array peymayesh mikonim

        Dreieck[] dreieck = new Dreieck[]{

                new Dreieck(2.5, 3),
                new Dreieck(4, 6),
                new Dreieck(4, 6)
        };

        //mikhaym yek shape ba adazehaye mokhtalef baham 2 be 2 moghayese konim, baraye inke bebine ba ham barabar hastan ya na
        //va shomarandeye i dar j gharar migire baraye inke nmeikhaym moghayeseye tekrari dashte bashim, pas j hamishe yek ghadam az shorooe i jelotar bashe
        //injuri az tekrar dar moghayese jelogiri mikoni, yani 2 ta shape yeksan dar nemiyan

        for (int i = 0; i < dreieck.length; i++) {
            for (int j = i + 1; j < dreieck.length; j++) {
                boolean gleich = dreieck[i].equals(dreieck[j]);                                 //ternary, age barabar bud jakhali chap kon, age naamosavi bud un chap kon
                System.out.println("Die Dreiecke an den Stellen " + i + " und " + j + " sind " + (gleich ? "" : "un") + "gleich!");
            }
        }

        Kreis[] kreise = new Kreis[]{
                new Kreis(4.5),
                new Kreis(2),
                new Kreis(4.5)

        };

        for(int i = 0; i < kreise.length; i++) {
            for(int j = i + 1; j < kreise.length; j++) {
                boolean gleich = kreise[i].equals(kreise[j]);                                   //age barabar bud "" ro va dar gheyre in soorat "un" ro chap kon
                System.out.println("Die Kreise an den Stellen " + i + " und " + j + " sind " + (gleich ? "" : "un") + "gleich!");
            }
        }

        Rechteck[] rechtecke = new Rechteck[]{
                new Rechteck(3 , 9),
                new Rechteck(3 ,9),
                new Rechteck(2 , 4)
        };

        for (int i = 0; i < rechtecke.length; i++){
            for(int j = i + 1; j < rechtecke.length; j++){
                boolean gleich = rechtecke[i].equals(rechtecke[j]);
                System.out.println("Die Rechtecke an den Stellen " + i + " und " + j + " sind " + (gleich ? "" : "un") + "gleich!");
            }
        }

    }

}











