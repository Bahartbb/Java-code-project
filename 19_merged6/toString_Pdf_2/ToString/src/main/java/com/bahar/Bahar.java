package com.bahar;

public class Bahar {

    String name;
    int age;

    public Bahar(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return "name: " + name+ " ," + " age: " + age;
    }



    public static void main(String[] args) {


        Bahar bahar = new Bahar("Sara" , 20);
        System.out.println(bahar);

    }
}
