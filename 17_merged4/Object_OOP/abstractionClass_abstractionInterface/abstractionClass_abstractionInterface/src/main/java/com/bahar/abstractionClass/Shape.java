package com.bahar.abstractionClass;

//baraye inke yek class be abstraction tabdil beshe, beyne access modifier va class keyworde abstarct ro miyarim
//class abstarct yek abstractione nesbie, yani beyne 0 ta 100 darsad (abstracte kamel nist)
//classe abstract mitoone methodhaye ba badane ya bedoone badane dashte bashad
//method bedoone badane mishe hamoon methode entezaei ya methode abstarction
//va methode ba badane mishe methode gheyre abstract ya methode addi
//methode entezaei dar class abstraction ba kalameye kilidiye abstract bayad declare shavad
//az class abstract nemitavan object ya nemoone sazi az class ro anjam dad
//methodha dar classe abstraction tamame halathaye access modifier ro mipaziran

public abstract class Shape {

    //access modifier + abstract + return type + method name
    abstract void area(double a, double b);

    public abstract void heightCalculator();

    abstract double deepCalculator();

    void printName(String name){
        System.out.println("the name of the shape is: " + name);
    }
}
