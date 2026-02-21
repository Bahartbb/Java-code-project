package com.bahar;

//barname ine ke ye seri method tooye classe Rucksack benevisi, bad unaro tooye classe Mensch call koni, bad hamaro baham dar classe App dar main call koni


public class App 
{
    //inja bejaye inke mostaghim call method ro az classe mensch, aval miaym ye nemoomne object azash biroone main misazim,
    //bad un nemoone classe sakhte shode ro dar main call mikonim, azoonjayi ke hamaeye methodha dar methode mensch call shodan, hame yeja inja call mishan


    public static void main( String[] args ) {

        mensch.gegenstandGefunden();

    }

    static Mensch mensch = new Mensch();  //chon method main static hast, bayad nemoone objecti ke az class misazim, static bashe ke betunim azash dar main estefade konim
                                          //static ro mizarim poshte esme class
}
