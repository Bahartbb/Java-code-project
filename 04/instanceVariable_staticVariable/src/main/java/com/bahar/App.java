package com.bahar;


import jdk.jfr.internal.tool.Main;

public class App
{
    // instance variable or property or field

    int age = 33;
    String firstName = "Bahar";
    String lastNAme = "tbb";
    String city = "Duesseldorf";
    String postalCode = "40227";



    // static variable or class variable
/*
        int age2 = "35";
        static String firstName2 = "Ata";
        static String lastName2 = "Bayat";
        static double grade = "58.20"*/;

    public static void main( String[] args ) {

        //age in variable haye inctance ya on static dar khode methode main ke static hast
        //declare mishodan dg lazemn nabud object besazim va ba object invoke konim
        /*int age = 33;
        String firstName = "Bahar";
        String lastNAme = "tbb";
        String city = "Duesseldorf";
        String postalCode = "40227";*/



       /* //instance variable invoke method
        System.out.println(app.);

        // static variable invoke method
        System.out.println(Main.);
*/

        App app = new App();

        System.out.println(app.age);

    }
}


