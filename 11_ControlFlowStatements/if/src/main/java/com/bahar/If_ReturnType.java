package com.bahar;

public class If_ReturnType {

    public static String scoreCheck(float score){

        if(score >= 18){
            return "got to be candidated";
        } else if (score >= 15 && score < 18) {
            return "got to be reserved";
        } else {
            return "neither candidated nor reserved";
        }

    }

    public static void main(String[] args) {

        System.out.println(scoreCheck(16)); //chon bala sout be kar narafte hatman bayad aval sout biari bad call koni method ro

    }
}
