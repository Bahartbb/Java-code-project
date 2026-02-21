package com.bahar.abstractionInterface;

//dar abstarctionInterface ebteda baraye ye mafhoome kolli yek interface ijad mikonim
//interface class nist balke yek gharardade ke dar aan mafahime kolli gofte mishan dar ghalebe method
//alan flower yek mafhoome kollist
//access modifier dar interface karbordi nadare
//tamamiye method ha entezayi (abstract) hastan, be ebearati body nadaran
//kalameye kilidiye abstract dar inja karbordi nadarad chon zatan abstract hastan
//interface ha abstracye motlagh hastan, yani kolle methodha bayad bedoone badane bashand magar 2halate khas
//ke az javaye 8 be bad be java ezafe shod ke be aan halate default method va static method gofte mishe

public interface Flower {

    void getColor(String color); //mitoone input ham nagire

    int sum (int golBarg);

    String printName (String flowerName);


    //az java 8 be bad:
    //kalameye kilidiye default ya static ro age bekar bebarim ghable tarife method, method mitune body dashte bashe

    default void smell(){
        System.out.println("it smells good");
    }



    default String isSharp(boolean sharpness){
        if (sharpness == true)
            return "the flower is sharp";
        else
            return "the flower isn't sharp";
    }


    //_______________________________________________________________

    static void pick(){
        System.out.println("it is picked");
    }



    static String getAge(int age){
        if (age > 2)
            return "the flower is young";
        else
            return "the flower is old";
    }






}
