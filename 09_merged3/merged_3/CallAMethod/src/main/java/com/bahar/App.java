package com.bahar;

//class method or static method:
// mikhay ye methode private ro call koni dar main, bayad esme class. ro biari bad esme method

public class App
{
    public static void main( String[] args ) {
        App.sage("Hello world!");

    }

    private static void sage(String etwas){
        System.out.println(etwas);
    }
}

