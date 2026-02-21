package com.bahar.Clone_Demo;

public class Clone_Demo_1 implements Cloneable {

    long postalCode;
    Integer housNumber;

    //marahele estefade az methode Clone az Object:
    // 1- implementation of interface Cloneable, mesle halate interface jeloye esme class minevisi implements Cloneable
    // 2- bayad methode Clone az classe Objecte pedar ro override kone
    // 3- az super.clone() estefade konim, kolle chizhayi ke marboot be padar hast ro inja piyade mikone

    public Clone_Demo_1(long postalCode, Integer housNumber){
        this.postalCode = postalCode;
        this.housNumber = housNumber;

    }

    //1- bala dar jeloye class Cloneable ro implement kon
    //2-
    //3-
    public Object Clone() throws CloneNotSupportedException {
        return super.clone();
    }


    public static void main(String[] args) throws CloneNotSupportedException {

        //baraye clone kardan, aval ye object az class besaz
        Clone_Demo_1 cloneDemo1 = new Clone_Demo_1(40227, 40);

        //hala mikhay az Object copy anjam bedi
        //pas az Clone_Demo yani classemoon ye objecte dige besaz (be esme copy)
        Clone_Demo_1 copy = (Clone_Demo_1) cloneDemo1.Clone();

        //hala amaliyate copye nahayi
        //dar har 2halat bayad ye khoroojie yeksan bede
        System.out.println(cloneDemo1.postalCode);
        System.out.println(copy.postalCode);

        boolean isTrue = cloneDemo1 == copy;
        System.out.println(isTrue);


    }
}
