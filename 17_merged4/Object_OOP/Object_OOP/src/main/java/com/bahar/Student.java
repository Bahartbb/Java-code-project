package com.bahar;


import java.sql.Struct;

public class Student {

    String name;
    int age;
    String city;
    double score;


    public static boolean isPassed(double score){
        return true;
    }

    public static void goToUni(){
        System.out.println("the student goes to university");
    }

    public static String invoice(String fee){
        return "paid" + fee;
    }


    public int getAge(int age){
        return age;
    }

}
