package com.bahar;


public class App 
{

    public static boolean checkEven (int num){
        if (num % 2 == 0){
            return true;
        }
        //return false;  --> ya mituni ye sare return fasle benvisi, chon ke halate digei nadarim
        else {
            return false;  //dakhele {} minevisim chon chanta shart nadashtim
        }

    }



    public static boolean checkOdd (int num){
        if (num % 2 != 0){
            return true;
        } else{
            return false;
        }
    }




    public static void main( String[] args ) {

        System.out.println("the given number is even: " + checkEven(42));
        System.out.println("the given number is even: " + checkEven(27));
        System.out.println("the given number is even: " + checkEven(28));
        System.out.println("the given number is even: " + checkEven(20));
        System.out.println("the given number is odd: " + checkOdd(42));
        System.out.println("the given number is odd: " + checkOdd(27));
        System.out.println("the given number is odd: " + checkOdd(28));
        System.out.println("the given number is odd: " + checkOdd(20));



    }
}
