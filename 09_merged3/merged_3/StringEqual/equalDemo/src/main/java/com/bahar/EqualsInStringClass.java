package com.bahar;

public class EqualsInStringClass {

    //equals to vs ==

    // ==
    //miyad value ha ro moghayese mikone, sharte 1: agar barabar budand yeki az sharthaye true budan ra darad
    //sharte 2: reference ya name bayad be yek khane az hafeze eshare dashte bshand, be raveshaye moskhtalef nabayd ijad shode bashan

    //String str1 = "bahar";
    //String str2 = new String("bahar");  --> 2 raveshe mokhtalef

    //chon inja "bahar"az 2 raveshe mokhtalef tolid shode, pas be yek khooneye moshakhas az hafeze eshare nadare
    //va dar natije equals ro barabar ba false mishe
    // baraye baragharar budane equal bayad har 2ta shart bargharar bashe


    // equals to:
    //miyad value ha ro moghayese mikone, agar barabar budand sharte barabar budan ro dare

    public static void main(String[] args) {


        // .equals()
        String str1 = "bahar";
        String str2 = "sara";

        boolean isEqual1 = str1.equals(str2);
        System.out.println("str1 is equal to str2 : " + isEqual1); //false

        //---------------------------//

        String str3 = "bahar";
        String str4 = new String("bahar");

        boolean isEqual2 = str3.equals(str4);
        System.out.println("str3 is equal to str4 : " + isEqual2); //true

        //___________________________________________________________________________________

        // == :

        String str5 = "bahar";
        String str6 = "sara";

        boolean isEqual3 = str5 == str6;
        System.out.println("str5 is equal to str6 : " + isEqual3); //fasle


        //---------------------------//

        String str7 = "bahar";
        String str8 = new String("bahar");

        boolean isEqual4 = str7 == str8;
        System.out.println("str7 is equal to str8 : " + isEqual4);  //fasle --> stringha be raveshhaye motefaveti ijad shodan





    //==

    String mystr1 = "John";
    String mystr2 = " ";

    boolean isTheSame = mystr1 == mystr2;

        System.out.println(isTheSame);  //fasle


        //____________________________________________________________

        String mystr3 = " ";
        String mystr4 = "";

        boolean isTheSame2 = mystr3 == mystr4;

        System.out.println(isTheSame2);  //false

        //____________________________________________________________


        //equals

        boolean isTheSame3 = mystr3.equals(mystr4);

        System.out.println(isTheSame3);  //false


        //---------------------------------------------------------------



        String mystr5 = "bahar";
        String mystr6 = new String("bahar");

        boolean isTheSame4 = mystr5 == mystr6;

        System.out.println(isTheSame4);   //false --> stringha be raveshhaye motefaveti ijad shodan

        //____________________________________________________________

        String mystr7 = "bahar";
        String mystr8 = new String("ali");

        boolean isTheSame5 = mystr7 == mystr8;   //fasle

        System.out.println(isTheSame5);

     //___________________________________________________________________





        String strN = "sara";
        String strM = new String("sara");
        // String str5 = new String("sara");

        boolean isEqualN = strM.equals(strN);
        boolean isEqualM = strN == strM;
        // boolean isEqual3 = str4.equals(str5);

         System.out.println(isEqualN);  //true
         System.out.println(isEqualM);  //false
        //  System.out.println(isEqual3);

        //____________________________________________________________________


        String myStr9 = "bahar";
        boolean areEqual = myStr9 == "sara";
        System.out.println(areEqual);   //false

        String myStr10 = "bahar";
        boolean areEqual2 = myStr10 == "bahar";
        System.out.println(areEqual2);    //true


    }


}
