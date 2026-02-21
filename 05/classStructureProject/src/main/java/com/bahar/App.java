package com.bahar;


public class App 
{

    public static void main( String[] args ) {


        //invoke or call static methods/function
        bahar();
        System.out.println(subtraction(16 , 4)); //print ro age dar khode method nanaeveshti, inja minvisi dakhele sout
        multiply(2.2,2.2);


        //invoke or call non static methods/function
        //formula of creating an object or instance class:
        //class + specific name + = + new + constructor of class
        App app = new App();
        App app2 = new App();
        App app1 = new App();
        App app3 = new App();
        App app4 = new App();


        app.bahar2("sara");
        app1.bahar2("Reza");

        app2.sum(3,7);

        app3.division(20,2);

        app.division(30,6);



    }


    //Access modifier: public, protected, default, private
    //public > protected > default > private

    //ajzaye yek calss:

    //instance variable or non static --> chizhayi k dar yek kelas mojazim estefade konim:
    //Access modifier + data type + data name + ;

    public int age;
    String name; //default
    private String lastName;
    protected String city;

    //static or class variable
    // Access modifier + static + data type + data name + ;

    static int age1;
    private static String name2;
    public static String city2;


    //constructor
    public App(){


    }

    //static or class method/function
    //Access modifier + static + return type + method name + ( + data type input method + input name + , + other inputs + ) + {command java code}
    public static void bahar(){

        System.out.println("bahar");
    }

    public static int subtraction (int a , int b){

        int result2 = a - b;
        return result2;
    }


    //multiplication a and b in math:

    public static double multiply (double a , double b){

        double result3 = a * b;
        System.out.println(result3);
        return result3;

    }



    //non static or instance method/function
    //Access modifier + return type + method name + ( + data type input method + input name + , + other inputs + ) + {command java code}
    public void bahar2(String name){

        System.out.println(name);
    }


    public int sum (int a , int b){


        int result = a + b;
        System.out.println(result);
        return result;
    }


    //division a and b:

    public long division(long a , long b){

        double result4 = a / b;
        System.out.println(result4);
        return (long)result4; //cast injam dadim, chon result ro double moarefi kardim, dar hali ke signature method va voroodiha long hastan, pas type signature method ro cast mikonim
    }





}
