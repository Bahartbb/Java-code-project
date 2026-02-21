package com.bahar;

public class GreetingMethod {

    //The greeting method should return a greeting depending on the name passed as a parameter.
    // Complete the greeting method so that it satisfies the following examples:
    //
    //greeting("Anton") --> "Hello, Anton!"
    //greeting("Barbara") --> "Hello, Barbara!"
    //greeting("Christoph") --> "Hello, Christoph!"


    public static String greeting(String name){
        return "Hello," + " " + name + "!";
    }

    public static void main(String[] args) {
        System.out.println(greeting("Anton"));
        System.out.println(greeting("Barbara"));
        System.out.println(greeting("Christoph"));
    }
}
