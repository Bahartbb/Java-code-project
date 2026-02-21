package com.bahar;

//mikhaym be jaye inke hameye method ha ro ar main call konim, ye constructor besazim va dar un call konim,
// bad "new constructor();" ro dar main call konim
//constructor ham esme classi ke toosh hast va ba () va {} nevshte mishe

public class App 
{
    public App(){

        //chon az jense return type bood bayad dar sout neveshte beshe
        System.out.println(verbindeString("a", "b"));

        //chon void hast bayad bedoone sout neveshte beshe, sout lazem dashti, inja nemituni benivisi, dakhele khode void minevisi
        subtraktion2(4,2);


    }






    public static String verbindeString(String a, String b) {
        return a + b;
    }

    public static boolean aIstGleichB(String a, String b) {
        if (null != a)
            return a.equals(b);
        else
            return null == b;
    }

    public static boolean aIstKleinerAlsB(String a, String b) {
        if (null != a)
            return 0 > a.compareTo(b);
        else
            return false;
    }

    public static char holeZeichenAnPosition(String input, int position) {
        return input.charAt(position);
    }

    public static String ersetzeMitte(String input, char trenner) {
        int start = input.indexOf(trenner, 0);
        int stop = input.indexOf(trenner, start + 1);
        String subStr = input.substring(start + 1, stop);
        subStr = subStr.replace('a', 'X');
        return input.substring(0, start) + subStr
                + input.substring(stop + 1, input.length());
    }

    public static int addition(int a, int b){
        return a+b;
    }

    public static int subtraktion(int a, int b){
        return a-b;
    }

    public static int multiplikation(int a, int b){
        return a*b;
    }

    public static int quersumme(int a){
        int quersumme = 0;
        while(a != 0) {
            quersumme += a % 10;
            a /= 10;
        }
        return quersumme;
    }

    public static double millionaer(double startkapital, double zinssatz){
        //Zinsfaktor umrechnen
        double zinsfaktor = 1.0 + (zinssatz/100.0);

        //Auf das Jahr genaue iterative Lösung mit Zählschleife
        int jahre;
        for(jahre=0; startkapital < 1000000; jahre++) {
            startkapital *= zinsfaktor;
        }
        return jahre;
    }


    public static void subtraktion2(int a, int b){
        System.out.println(a - b);
    }








    //baraye call kardane dar main, new mikoni  un constructor ro, yani new esme constructor va ();

    public static void main( String[] args )
    {
        new App();
    }
}
