package com.bahar;
//barname ine ke ye seri method tooye classe Rucksack benevisi, bad unaro tooye classe Mensch call koni, bad hamaro baham dar classe App dar main call koni

public class Rucksack {

    //mibinim baraye koole psohti che raftar va che methodhayi be kar mishe gereft: mese bazo baste kardan

    //1-method types that consist of procedure: --> void type
    //2-method types that consist of function: --> return type (int, float, double, short,...)

    //1-

    public static void oeffnen(){    //static hafeze ro modiriat mikone
        System.out.println("den Rucksack oeffnen");
    }

    public void schliessen(){    //non static hafeze ro modiriyat nmikone
        System.out.println("den Rucksack schliessen");

    }

    //2-

    public static String reperatur(){
        System.out.println("ich repariere den Rucksack");
        return "swing";
    }

    public boolean numberOfWasserFlasche(int a){      //inpute method rabti be type e method nadare, harchizi mitune bashe
        System.out.println("the number of water bottles in the backpack is: ");
        a = 10;
        if(a <= 0){
            System.out.println("the backpack is empty");
            return false;
        } else if (a > 0) {
            System.out.println("there are 10 bottles of water in the backpack");
            return true;
        } else {
            System.out.println("i don't know");
            return false;
        }

    }


}
