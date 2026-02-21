package com.bahar;

public class Ternary_In_Method {

 //ternary ba return type method

    public static String getResult(int score){

        String result = ((score >= 50) ? "passed" : "failed");
        return result;

    }

    public static boolean getResult2(int score){

        boolean result = ((score >= 50) ? true : false);
        return result;

    }



    //ternary ba void method

    public static void getResult3(int score){

        String result = ((score >= 50) ? "passed" : "failed");
        System.out.println(result);
    }


    public static void getResult4(int score){

        boolean result = ((score >= 50) ? true : false);
        System.out.println(result);

    }







    public static void main(String[] args) {

        System.out.println(getResult(65));
        System.out.println(getResult(45));

        System.out.println(getResult2(35));
        System.out.println(getResult2(76));

        getResult3(55);

        getResult4(89);

    }
}
