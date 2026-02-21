package com.bahar.pdfExample;


public class Mensch_1 {

    //declare kardane yek variable az jense classe hamsaye dar classe feli ke betunim azash estefade konim:
    //darim ye variable az jense classe Rucksack ijad mikonim ke data tyoesh az jense classe Rucksack hast, type data mitoone az jense class ham bashe mesle String
    //private kardim ke az biroone in class dastresi vojood nadashte bashe
    //rucksack ham variable hast
    //majmooan be in amal declaration gofte mishe
    private Rucksack_2 rucksack;


    //mikhaym be moteghayere declare shodeye bala mghdar bedim(intialize)
    //baraye inkar bayad method injad konim
    private void bauRucksack(){

        rucksack = new Rucksack_2(this);

    }


    public static void main( String[] args ) {

        //baraye call kardane methode voide non statice bala, aval ye object azash ijad mikonim

        Mensch_1 mensch = new Mensch_1();
        mensch.bauRucksack();
    }
}
