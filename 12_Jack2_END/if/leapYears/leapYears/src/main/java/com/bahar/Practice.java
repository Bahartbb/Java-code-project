package com.bahar;

public class Practice {

    //1- bar 4 bakhsh pazir bashe (OR beshe ba payini)
    //2- bar 400 AND 100 hamzaman bakhpazir bashe


    public static void main(String[] args) {

        System.out.println("the state of leapYear is: " + leapYear(2025));  //true
        System.out.println("the state of leapYear is: " + leapYear(2024));  //fasle
        System.out.println("the state of leapYear is: " + leapYear(2023));  //fasle
        System.out.println("the state of leapYear is: " + leapYear(2022));  //fasle
        System.out.println("the state of leapYear is: " + leapYear(2021));  //true
        System.out.println("the state of leapYear is: " + leapYear(2020));  //fasle
        System.out.println("the state of leapYear is: " + leapYear(2019));  //false
        System.out.println("the state of leapYear is: " + leapYear(2018));  //fasle
        System.out.println("the state of leapYear is: " + leapYear(2017));  //false
        System.out.println("the state of leapYear is: " + leapYear(2016));  //true
    }



    public static boolean leapYear(int year){

        if((year % 4 == 0) || (year % 400 == 0 && year % 100 == 0)){
            return true;
        } else {

        }
        return false;

    }
}
