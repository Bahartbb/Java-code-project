package com.bahar;

public class Tamrin {

    public static boolean aIstGleichB2(String a, String b) {
        if (null != a)
            return a.equals(b);   //return kon aya (boolean) a mosavie b ast ya na, true false bede
        else
            return null == b;   //agar if nabud, 1 halate dg bishtar vojood nadare, yani natijeye null==b ro bargardoon
    }



    public static boolean aIstKleinerAlsB(String a, String b) {
        if (null != a)
            return (0 > a.compareTo(b));
        else
            return false;
    }


    public static boolean aIstKleinerAlsB4(String a, String b) {
        int result = a.compareTo(b);  //result = 0 or 1 0r -1
        if (null != a)
            //return (0 > a.compareTo(b));
           return 0 > result;
        else
            return false;
    }



    public static String ersetzeMitte(String input, char trenner) {
        int start = input.indexOf(trenner, 0);
        int stop = input.indexOf(trenner, start + 1);
        String subStr = input.substring(start + 1, stop);
        subStr = subStr.replace('a', 'X');
        return input.substring(0, start) + subStr
                + input.substring(stop + 1, input.length());
    }


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
        return input.substring(0, start) + subStr + input.substring(stop + 1, input.length());  //input.length mige ta harchi baghimoonde moond biar


    }




    public static int quersumme(int a){
        int quersumme = 0;   //vazifash zakhire sazie majmooe argham hast
        while(a != 0) {     //darim ye sharti ro barresi mikonim, mige in shart edame dare ta zamani ke a be 0 berese, yani a 0 beshe dg dakhele whule ejra nemishe
            quersumme += a % 10;     //inja baghimoonde a taghsim bar 10 be dast miad, yani akharin raghame adade a ro begir be quersumme ezafe kon
            a /= 10;    //ba inkar yek ragham ro az samte raste adade a hazf kon
        }
        return quersumme;
    }












    public static void main(String[] args) {

        //System.out.println(aIstGleichB2("Fariba", ""));
        //System.out.println(aIstKleinerAlsB("a" , "b"));





        String input2 = "apple,orange,banana";
        char seperator = ',';
        int start = 5;
        int stop = 12;

        System.out.println(input2.substring(start , input2.length()));  //mikhaym ,orange,banana ro bede, mige az start (5) shoroo kon, bad input2.length() mige baghieye text(badaaz start) harchi hast ro biar
        System.out.println(input2.substring(0 , stop + 1));   //mikhaym apple,orange, ro bede, pas az index 0 shoroo kon, ta stop + 1 boro




        int num = (int) 34.5;
        System.out.println(num);

    }
}
