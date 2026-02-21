package com.bahar;

//indexOf:
//jaygahe har character ro dar yek reshte String moshakhas mikone

public class App 
{
    public static void main( String[] args ) {

        String example = "Hello World";

        int index = example.indexOf('H'); //baraye character az ' ' esrefade mikonim
        System.out.println("postion of H is: " + index);

        int index2 = example.indexOf("llo");  //baraye string az " " estefade mikonim
        System.out.println("position of llo is: " + index2);

        int index3 = example.indexOf("bahar");
        System.out.println("position of bahar is: " + index3); //age chizio bekhay ke toosh vojood nadashte bashe manfi mide

    }
}
