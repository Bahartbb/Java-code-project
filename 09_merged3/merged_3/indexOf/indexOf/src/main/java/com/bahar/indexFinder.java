package com.bahar;

public class indexFinder {

    public static void main(String[] args) {

        String sentence = "Hi, my name is Bahar";

        int index = sentence.indexOf("m");
        System.out.println("the position of 'm' is: " + index);

        int index_2 = sentence.indexOf("is");
        System.out.println("the position of 'is' is: " + index_2);

        int index_3 = sentence.indexOf("Hello");
        System.out.println("the position of 'Hello' is: " + index_3);
    }
}
