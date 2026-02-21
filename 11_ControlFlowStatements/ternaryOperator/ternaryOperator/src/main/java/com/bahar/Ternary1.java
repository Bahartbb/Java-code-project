package com.bahar;

//5.عملگر شرطی (Operator Ternary
//این عملگر یک نوع خالصه از ساختار else-ifاست که برای شرایط ساده استفاده میشود. این عملگر یک شرط را بررسی میکند و
//یک مقدار بر اساس نتیجه شرط برمیگرداند

//vaghti fard be 18 salegi mirese bayad bere khedmat, age nareside felan sabr kone
public class Ternary1
{

    public static void main( String[] args )
    {
//        int age = 18;
//        if(age >= 18){
//            System.out.println("go to army");
//        } else {
//            System.out.println("under 18 years old");
//        }


        int age = 15;
        String result = ((age >= 18) ? "go to army" : "under 18 years old");
        System.out.println(result);


    }
}
