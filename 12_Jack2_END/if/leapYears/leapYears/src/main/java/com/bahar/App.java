package com.bahar;

//This task is about indicating when a year is a leap year. (sale kabiseh):
//ya bar 4 bakhpazir bshe OR (bar 400 AND 100 hamzaman bakhshpazir bashe)


public class App 
{
    //3 ta shart dare sale kabiseh budan: (meyar 1 sal hast) :
    //baraye tashkhise leapYear budan bayad be 400 bakhshpazir bashe,
    //agar bar 100 bakhshpazir bud va bar 400 nabud, kabiseh nist, yani bar 100 AND 400 hamzaman bakhpazir bashe
    //age 1 sal (tedade roozha) bar 4 bakhshpazir bud, kabiseh hast, yani ba 4 OR 100 AND 400 bakhshpazir bashe


    public static boolean leapYear(int year){

        if ((year % 4 == 0) || ((year % 400 == 0) && (year % 100 != 0))) {
            return true;
        } else {
            return false;
        }

    }


    public static void main( String[] args ) {

        System.out.println("2016 is a leap year: " + " " + leapYear(2016));
        System.out.println("2004 is a leap year: " + " " + leapYear(2004));
        System.out.println("2000 is a leap year: " + " " + leapYear(2000));
        System.out.println("2015 is a leap year: " + " " + leapYear(2015));
        System.out.println("2003 is a leap year: " + " " + leapYear(2003));
        System.out.println("1900 is a leap year: " + " " + leapYear(1900));

    }



}
