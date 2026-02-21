package com.bahar;


//BlackJack:
//In this method you should check whether one of the two parameters 'val1' or 'val2' is <= 21.

public class App
{

    //bazi beyne 2 ta adade voroodiye : yeki adade bazikone, yeki adade dealer
    //khorooji yek adade sahih, yani type method int hast

    //ghanoone bazi: mishe hamoon if haa
    //bayad ba adade 21 saro kar dashte bashi

    //ghanoone 1: agar har 2 bazikon adadaeshoon az 21 bozogtar bashe, har 2 mibazan, return -1
    //ghanoone 1-1: age bazikon bishtar az 21 biyare bakhte, yani return -1
    //ghanoone 1-2: age dealer bishtar az 21 bashe, yani bazikon mibare, return 1


    //dar kol har ki adadesh bozogtar bud un barandas:
    //ghanoone 2-1: aga har 2 adad <=21 va adade dealer bozogtar az adade bazikon bshe, return -1
    //ghanoone 2-2: agar har 2 adad <=21 va adade bazikon bozorgatr az adade dealer bashe, return 1

    //ghanoone 3: agar dealer va bazikon adade mosavie ham dashtan, return 0



    public static int blackJack(int player , int dealer){

        if(player > 21 && dealer > 21)
            return -1;
        if (player > 21)
            return -1;
        if(dealer > 21)
            return 1;
        if(player <= 21 && dealer <= 21 && dealer > player) //
            return -1;
        if(player <= 21 && dealer <= 21 && dealer < player)
            return 1;
        //if (dealer == player)  //ino kollan neminevisim chon in khodesh yani else
            //return 0;

        else {
            return 0;
        }
    }



    public static void main( String[] args ) {

        System.out.println(blackJack(22,12));
        System.out.println(blackJack(12,22));
        System.out.println(blackJack(10,5));
        System.out.println(blackJack(15,31));
        System.out.println(blackJack(3,21));
        System.out.println(blackJack(50,20));
        System.out.println(blackJack(15,15));
        System.out.println(blackJack(21,21));
        System.out.println(blackJack(30, 29));
    }


}
