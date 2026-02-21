package com.bahar;

public class ReturnTypeInMethod {


    //void methods with return type:
    public static void bahar1(){

    }


    public static void bahar2(String name , String familyName , int age , Integer id , Double grade , boolean isActive , Boolean isStudent , float score){


    }


    private void bahar3(int age){

    }


    //non-void methods with return type: (chio return mitoone bokone)
    // includes: primitive data type: byte, int, short, long, float, double, boolean, char
    // non-primitive data type: Byte, Integer, Short, Long, Float, Double, Boolean, Character
    // non-primitive data type or reference type or wrapper class or class type: String, Array, Object, Bahar, ReturnTypeInMethod, ...
    // should return in method the upper type
    //return type or method type are equal


    //non primitive:
    private static ReturnTypeInMethod returnTypeInMethod(byte num1 , byte num2, int result){
       return new ReturnTypeInMethod();
    }

    private static Object objectMethod(){
        return new Object();
    }

    private static String stringMethod(){
        return "String";
    }


    //primitive:
    private static float average(short number1 , long number2){
       return 20; //jeloye return yek value barmigardoonim
    }

    private static double maximum(){
        return 100.23;
    }

    public boolean isAlive (int a, int b){

        boolean member = (a != b);
        return member;
    }

    public char firstLetter (){
        char firstChar = 'B';
        return firstChar;
    }

}
