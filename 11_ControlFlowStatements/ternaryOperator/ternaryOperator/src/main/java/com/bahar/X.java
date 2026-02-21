package com.bahar;

public class X {

    public static String checkScore(double score){

        String result = ((score > 4) ? "failed" : "passed");
        return result;
    }



    public static boolean isMature(int age){

        boolean maturity = ((age > 18 ? true : false));
        return maturity;
    }


    public static void main(String[] args) {

        System.out.println(checkScore(3)); //passed
        System.out.println(checkScore(4.5)); //failed


        System.out.println(isMature(22));
        System.out.println(isMature(17));
    }

}
