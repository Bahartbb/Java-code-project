package com.bahar;
//barname ine ke ye seri method tooye classe Rucksack benevisi, bad unaro tooye classe Mensch call koni, bad hamaro baham dar classe App dar main call koni

public class  Mensch {

    //call kardane methodhaye calsse dige inja maslan az Rucksack
    //using Rucksack


    //miaym inja yek methode dige misazim ke betunim  method haro az classe  dige call konim

    public void gegenstandGefunden(){

        //static method ro call kardan
        //esme classi ke mikhay azash call koni ro benveis . bezar
        Rucksack.reperatur();
        Rucksack.oeffnen();


        //non static method ro call kardan
        //bayad ye object besazi, esme calss + name bezar + = + new + esme class + ();
        //bad taze miay name ke entekhab kardi va . mizari ta betooni method haro call koni
        Rucksack rucksack = new Rucksack();  //ye nemoone az jense classe Rucksack moarefi kardim va constructor sakhtim
        rucksack.numberOfWasserFlasche(2);
        rucksack.schliessen();

    }
}
