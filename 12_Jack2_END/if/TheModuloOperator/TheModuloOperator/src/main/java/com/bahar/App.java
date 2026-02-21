package com.bahar;


public class App 
{

   public static boolean divisble (int num1, int num2){
       if (num1 % num2 == 0)
           return true;
       else {            //mituni else ham nayari, kollan bade bodye ghabli ye return false ham benevisi
           return false;
       }
   }



    public static void main( String[] args ) {

        System.out.println("divisibility of num1 by divisor num2: " + divisble(20,2));
        System.out.println("divisibility of num1 by divisor num2: " + divisble(30,3));
        System.out.println("divisibility of num1 by divisor num2: " + divisble(40,6));
        System.out.println("divisibility of num1 by divisor num2: " + divisble(20,3));
        System.out.println("divisibility of num1 by divisor num2: " + divisble(20,5));
        System.out.println("divisibility of num1 by divisor num2: " + divisble(11,3));


    }



}
