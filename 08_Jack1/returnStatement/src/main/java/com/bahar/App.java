package com.bahar;


public class App 
{
    public static void main( String[] args ) {

        /*getZero();*/
        /*getZero1(13,6);
        System.out.println(getZero2(6,5,2,7 ,4,9));*/
        System.out.println("Die Ausgabe sollte 0 sein: "+getZero());
        System.out.println("Die Ausgabe sollte 42 sein: "+get42());
        System.out.println("Die Ausgabe sollte false sein: "+isWrong());
        System.out.println("Die Ausgabe sollte 3.14 sein: "+PI());
    }

    public static int getZero() {
        //business logic: yani manteghe barname ya code inja piade sazi mishe
        return 10;
    }

    public static int getZero1(int a, int b) {
        int result;
            if(a % b == 0){
                System.out.println("The number even");
                result = a;
                System.out.println(result);
            } else {
                System.out.println("The number is odd");
                result = b;
                System.out.println(result);
            }
            return result;
    }

    public static int getZero2(int a, int b, int c, int d, int e, int f) {
        int result;
        result = a * b * c * d * e * f;

        return result;
        }
//--------------------------------------------------------------------------------------------------------------

    public static int get42() {
        return 16;
    }
//--------------------------------------------------------------------------------------------------------------

    public static boolean isWrong() {
        return false;
    }

//--------------------------------------------------------------------------------------------------------------

    public static double PI() {
        return 3.14;
    }



    public static double PI1() {
        return new Double(3.14);
    }
//--------------------------------------------------------------------------------------------------------------










}
