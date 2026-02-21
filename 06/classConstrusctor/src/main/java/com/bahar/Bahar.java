//step 1: define the package
package com.bahar;


//step 2: import of library
import java.util.List;  //mesle line e 82, 83, 84 ke az method haye mokhtalefe riyazi ba estefade az Math. mishe estefade kard


//step 3: define the class
public class Bahar {

    //step 4: define the instance variable or non static variable
    String name;


    //step 5: define the class variable or static variable
    private static String familyName;


    //step 6: define the constructor for class: jaye constructor ha dar sathe classe, na dakhele blocke methodha
    //mesle methodha amal mikonan, vali faghta dar sathe c
    //formula: Access modifier + class name (eshare dare be classi ke toosh hastim) + ( insert input ) + { command code }
    public Bahar(){

    }

    public Bahar(String message){

        System.out.println(message);
    }

    public Bahar(double x){

        System.out.println(x);

    }



    public Bahar(int w, int y, int z){

        int result = w + y + z;
        System.out.println("the result is: " + result);
    }



    public Bahar(String city , String postalCode , String birthDate) {

        System.out.println("City: " + city + "Postalcode: " + "Birthdate: " + birthDate);
    }


    //step 7: main method: noghteye voroode Project




    public static void main(String[] args) {

        Bahar invoke = new Bahar();
        invoke.sum(4, 8);

        //estefade az constructor: ye nemoone az yek class injad mikonim
        Bahar bahar1 = new Bahar(1.23);  //ye nemoone az calsse (bala) double x ijad kardim

        Bahar bahar2 = new Bahar("Duesseldorf " , "40227 " , "23.09.1991 "); //ye nemoone az calsse badi (bala) ijad kardim

        Bahar bahar3 = new Bahar(14 , 7 , 9);


    }

    //step 8: other methods: setter and getter method, method customize mesle sum, default methods ,...



    public int sum (int a , int b){

        List array;
        int result = a + b;
        System.out.println("sum of a , b is : " + result);
        System.out.println("log of result is : " + Math.log(result));
        System.out.println("minimum of a , b is : " + Math.min(a , b));
        System.out.println("the absolute value of result : " + Math.abs(result));
        return result;
    }

}
