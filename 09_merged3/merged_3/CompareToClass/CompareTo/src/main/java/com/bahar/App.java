package com.bahar;

public class App 
{
    //compare to: (tozihate methode compare to dar java) ---> Integer type
    //ye adade sahih ya meghdare sahih ro barmigardoone chon type in method "Integer" hastesh
    //rooye class ya object kar mikone, nemitoone primitive data type barash moarefi konim,faghat non primitive ya wrappper mipazire

    //3 halate khorooji dare:
    //1- agar 2 object ke compare mishan, tedade character hashoon ba ham barabar bashan, meghdare 0 barmigardoone
    //2- agar objecte aval tedade characterhash az objecte 2vom ke moghayese mishan bozorgtar bashan adade mosbat barmigardoone
    //3- agar tedade character haye objecte aval az objecte 2vom ke moghayese mishan koochektar bashan adade manfi barmigardoone

    public static void main( String[] args ) {

        String str1 = "bahar";
        String str2 = "bahar";

        Integer result1 = str1.compareTo(str2);

        System.out.println(result1); //chon tedede character ha dar har 2 barabar bu, 0 dad

//----------------------------------------------------------------------

        String str3 = "bahar";
        String str4 = "1234";

        Integer result2 = str3.compareTo(str4);

        System.out.println(result2);  //tedade character haye objecte aval bozogtar az 2vom bud, mosbat dad

//----------------------------------------------------------------------
        String str5 = "bahar";
        String str6 = "tbtbtbtbtbtb";

        Integer result3 = str5.compareTo(str6);

        System.out.println(result3);  //tedade character haye objecte aval koochiktar az 2vom bud, manfi dad
    }
}
