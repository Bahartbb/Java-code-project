package com.bahar;


import javax.jws.Oneway;

public class App
{
    //declaration = define = tarif kardan = create = make
    //darim yek variable az jense class ijad mikonim, ke betunim inja barash object besazim va azash dar in class betuni estefade konim
    // type in variable mishe jense class Wecker

    static Wecker einfachGruen;

    static Wecker clock;


    //initialization = new kardan = object sakhtan
    //mikhaym ye object az in classe Wecker ijad konim
    //inkar ro dar methode (masalan main) mishe anjam beshe, dar badaneye class nemishe
    //bekhatere inke payin maethode main static hast bayad declaration bala ro static konim




    public static void main( String[] args )
    {
        einfachGruen = new Wecker();

        clock = new Wecker();

    }
}
