package com.bahar;


import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {

        /*String name = "Bahar";   //mikhaym yek feature be esme name ro vared konim (dar hafze zakhire konim) ke bad betoonim tooye sout benvisim va printesh konim
        String familyName = "Tabakhpourlangeroudi";
        int age = 33;*/

        /*System.out.println( "Bahar" );
        System.out.println(name);  //baraye inke chap koni in khoone az hafeze ke sakhti ro be in esm miyari minvisi
        System.out.println(familyName);
        System.out.println(age);*/


        Scanner getData = new Scanner(System.in);

        System.out.println("Please insert the required datas");
        System.out.println("1." + " " + "firstName:");
        String firstName = getData.next();
        System.out.println(firstName);


        System.out.println("2." + " " + "lastName:");
        String lastName = getData.next();
        System.out.println(lastName);


        System.out.println("3." + " " + "postalCode:");
        double postalCode = getData.nextDouble();
        System.out.println(postalCode);


        System.out.println("4." + " " + "age:");
        int age = getData.nextInt();
        System.out.println(age);


        System.out.println("5." + " " + "birtDate:");
        String birthDate = getData.next();
        System.out.println(birthDate);


        System.out.println("6." + " " + "major");
        String major = getData.next();
        System.out.println(major);


        System.out.println("7." + " " + "universityName");
        String universityName = getData.next();
        System.out.println(universityName);


        System.out.println("8." + " " + "grade");
        float grade = getData.nextFloat();
        System.out.println(grade);


        System.out.println("9." + " " + "mathPoint");
        double mathPoint = getData.nextDouble();
        System.out.println(mathPoint);


        System.out.println("10." + " " + "isActive:");
        boolean isActive = getData.nextBoolean();
        System.out.println(isActive);


        System.out.println("11." + " " + "firstNameLetter");
        char firstNameLetter = getData.next().charAt(0);//.next ro bezan, bad dobare .charAt ro bezan ke betooni begi kodoom letter ro mikhay
        System.out.println(firstNameLetter);
    }
}
