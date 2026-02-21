package com.bahar;


public class App 
{
    public static void main( String[] args ) {

        String myLaptopBrand = "Apple";
        String yourLaptopBrand = "Lenovo";
        boolean isTheSame = (myLaptopBrand) == (yourLaptopBrand);


        String myLaptopBrand2 = "Apple";
        String yourLaptopBrand2 = "Apple";
        boolean isNotTheSame = myLaptopBrand2.equals(yourLaptopBrand2);

        System.out.println(isTheSame);
        System.out.println(isNotTheSame);;

    }
}
