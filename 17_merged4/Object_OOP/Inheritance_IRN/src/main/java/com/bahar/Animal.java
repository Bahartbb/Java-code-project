package com.bahar;


public class Animal
{
   private String name;
   private int age;

   public Animal(){

   }


   public Animal(String name){
       this.name =name;
   }


   public Animal(int age){
       this.age = age;
   }


   public Animal(String name , int age){
       this.name = name;
       this.age = age;
   }





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public static void eat(String eatingType){
        System.out.println("the animal eats: " + eatingType);
    }

    public static void move(String walk){
        System.out.println("the animal can move: " + walk);
    }




    public static void main(String[] args) {

//ina hame ghalatan, chon superclass nemitune be ajzaye subclass dastresi dashte bashe
//pedar ya pedarbozotg nemitune variable va methodahye farzand ya nave ro begire

       Animal animal = new Animal();  //false

       Animal animal1 = new Dog();     //fasle

       Animal animal2 = new GermanDogTypeA();   //false



    }







}



