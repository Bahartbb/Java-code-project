package com.bahar;

public class If_Void {

    public static void scoreCheck(float score){

        if(score >= 18){
            System.out.println("got to be candidated");
        } else if (score >= 15 && score < 18) {
            System.out.println("got to be reserved");
        } else {
            System.out.println("neither candidated nor reserved");
        }

    }

    public static void main(String[] args) {

        scoreCheck(16);  //chon sout tooye void be kar rafte nemitooni 2bare sout be kar bebari
        //System.out.println(scoreCheck(16));  //Cannot resolve method 'println(void)'
    }
}
