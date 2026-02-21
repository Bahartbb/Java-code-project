package com.bahar;

public class Student {

    String name;
    int age;
    String city;
    double grade;


    public static int getAge(int age){
        return age;
    }

    public String getCity(String city){
        return city;
    }

    public static void goToUni(boolean isGoing){
        System.out.println(isGoing);
    }

    public void study(boolean isTrue){
        System.out.println(isTrue);
    }
}
