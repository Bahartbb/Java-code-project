package com.bahar;

public class Bahar {

    //inja mikhaym az classe App ye seri az methodha  ro call konim

    public long multiplication (long a , long b) {

        App.num();
        App.sum();
        /*System.out.println(App.name);*/  //mikhastim moteghayere/methode name ro call konim, vali chon private bud nemishod tu kelase dg callesh konim, faghat tu hamun class ghabele call kardan bud

        //baraye call kardane private method, aval inke non static hast:
        App invoke = new App();
        /*invoke.division();*/  //chon in method private bud natunestim call konim, va faghat dar classe App ghabele ejrast

        long multiply = a * b;
        System.out.println(multiply);
        return multiply;

    }




}
