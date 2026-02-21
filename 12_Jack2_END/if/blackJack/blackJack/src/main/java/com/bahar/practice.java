package com.bahar;

public class practice {

    public static void main(String[] args) {

        System.out.println(blackJack(11,22));
        System.out.println(blackJack(22,11));
        System.out.println(blackJack(22,22));
        System.out.println(blackJack(19,19));
        System.out.println(blackJack(11,19));
        System.out.println(blackJack(19,11));
    }


    //agar ham dealer ham player <=21 , va value hashoon barabar bud , ya kollan value hashoon barabar bshe(nafaghat <= 21) return 0
    //agar ham dealer ham player <=21 , va value dealer bozorgtar az plazyer bud , reurn -1
    //agar ham dealer ham player <=21 , va value player bozorgatr az dealer bud, return 1

    //agar dealer <=21 va player >21 , return -1
    //agar player <=21 va dealer >21 , return 1

    //agar ham dealer ham player >21 , return -1


    public static int blackJack(int dealer , int player){

       /* if(dealer == player){
            return 0;
        }*/

        if((dealer <= 21 && player <= 21) && dealer > player){
            return -1;
        }

        if((dealer <= 21 && player <= 21) && dealer < player){
            return 1;
        }

        if(dealer <=21 && player >21){
            return -1;
        }

        if(player <=21 && dealer >21){
            return 1;
        }

        if(dealer >21 && player >21){
            return -1;
        }

        return 0;


    }

}

