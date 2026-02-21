package com.bahar;

//baharProject

/**/
/*
* baharProject college
*
* */

import java.util.Scanner;

/**
 * baharProject
 * Duisburg-Essen University
 *
 * */
public class App
{
    public static void main( String[] args ) {

    String name = "Bahar";   //mikhaym yek feature be esme name ro vared konim (dar hafze zakhire konim) ke bad betoonim tooye sout benvisim va printesh konim
    String familyName = "Tabakhpourlangeroudi";
    int age = 33;


        System.out.println( "Bahar" );
        System.out.println(name);  //baraye inke chap koni in khoone az hafeze ke sakhti ro be in esm miyari minvisi
        System.out.println(familyName);
        System.out.println(age);


        Scanner getData = new Scanner(System.in); //classe scanner baraye gereftane voroodi az karbar gerefte mishe, barash esm entekhab mikonim va : Scanner exampleName = new Scanner(System.in);




        System.out.println("Please enter your familyName"); // aval bayad soal beporse ke to betooni javab bedi vavared kon
        String familyName = getData.next(); //baraye inke betooni vared koni bayad jense un chiz va esme chizi k mikhay print she ro = ba esmi ke baraye scanner entekhab kardi bashe bad . va bayad entekhab koni kodoom
        System.out.println(familyName + " , " + "This is my familyName");


        System.out.println("Please enter your age");
        int age = getData.nextInt();
        System.out.println(age + " , " + "This is my age");


        System.out.println("Please enter your birthDate");
        String birthDate = getData.next();
        System.out.println(birthDate + " , " + "This is my birthDate");


        System.out.println("Please enter your grade");
        float grade = getData.nextFloat();
        System.out.println(grade + " , " + "This is my grade");


        System.out.println("Please enter your mathPoint");
        double mathPoint = getData.nextDouble();
        System.out.println(mathPoint + " , " + "This is my mathPoint");


        System.out.println("Please enter your postalCode");
        long postalCode = getData.nextLong();
        System.out.println(postalCode + " , " + "This is my postalCode");


        System.out.println("Please insert if you are an active student?");
        boolean isStudent = getData.nextBoolean();
        System.out.println(isStudent + " , " + "This is my state");


        System.out.println("please enter the first letter of your name");
        char firstNameLettr = getData.next().charAt(0);
        System.out.println(firstNameLettr + " , " + "This is the first letter of my name");



        System.out.println("please enter your data");
        System.out.println("Please enter your name");
        String name = getData.next();
        System.out.println(name + " , " + "This is my name");


        System.out.println("please enter the last letter of your name");
        char lastNameLettr = getData.next().charAt(4);
        System.out.println(lastNameLettr + " , " + "This is the last letter of my name");
    }
}
