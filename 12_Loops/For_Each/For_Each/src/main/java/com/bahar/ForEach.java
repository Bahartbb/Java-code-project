package com.bahar;

//این نوع حلقه که با نام each-forشناخته میشود، برای پیمایش آرایهها و مجموعهها (collections (استفاده میشود و خوانایی
//بیشتری دارد.

//  for (type variable : collection){
//        commands  (dastoorate morede nazar baraye ejra)
//  }

//mikhaym yek array ro chp konim

public class ForEach {

    public static void main(String[] args) {

       double[] grades = {2.5 , 1,7 , 3 , 2.3};
       for (double number : grades){
           System.out.println(number);
       }


       String[] names = {"Sara" , "Ali" , "Reza" , "Maryam" , "Mina" , "Sahar"};
       for(String firstNames : names){
           System.out.println(firstNames);
       }
    }
}
