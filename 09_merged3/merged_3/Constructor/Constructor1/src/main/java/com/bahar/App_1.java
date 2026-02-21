package com.bahar;


public class App_1
{
    public static void main( String[] args ) {

    //ma baraye inke be mohtaviyate yek classe dg dastresi dashte bashim, bayad yek nemoone, ye object az oon class ijad konim
    //hadaf ine ke yek object ya nemoone az jense classe Person ijad konim, baraye inke dastresi be mohtaviyate dakhele un class dashte bashim
    //person: (manzoor ba harfe p koochik) instance, class variable, instance class va object


        Person_1 person1 = new Person_1("bahar","tbb");
        System.out.println(person1);

        Person_1 person2 = new Person_1(33);
        System.out.println(person2);

        Person_1 person3 = new Person_1("Bahar", "tbb", 33, 19.69);
        System.out.println(person3);











    }
}
