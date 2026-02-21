package com.bahar;


public class App 
{

    public static void main(String[] args) {


    }

    //method definition:


    //method types in java: 1-void method  2-return type


    //void method:
    public void eat() {
        System.out.println("I am eating");
        //inja faghat ye chizi ro chap mikone, chizi baraye estefade bar nemigardoone

    }
        //return type:
        /*  Access modifier + static or  non static + return type + method name + (define variable) + {

             java command code

             }
        */

        // 1- Access modifier: public, default, protect, private

        // 2- use static or non static

        // 3- return type mitoone void ya primitive and non primitive bashe (int, double,...) --> return keyword

        // 5- dar () vodroodihaye method ro tarif mikonim mesle int a, string city, ...

        // 6- {} mahdoode method ro moshakhas mikone ke ma behsh migim local variable --> scope local variable
        // dar java har tedad voroodi mitune begire, vali faghat yek khorooji mide


        public int sum (int a, int b){

            return a + b;
        }

        // or

        public String eat1(String eatType) {

            return "I am eating with fork";
        }

        // data type: dar inja in String ya int miad output data type ro return mikone, be ebarati mige jense khorooji string ya int hastesh

        // (): paranteze khali dar eat, daresh hamoon parameter haye voroodiye method gharar migire

        // return: vaghti method bayad yek meghdar ro bargardoone,bayad az keyworde return dar method estefade beshe va ba tavajoh be jense method meghdare khorooji ro barmigardoone

        

    }

