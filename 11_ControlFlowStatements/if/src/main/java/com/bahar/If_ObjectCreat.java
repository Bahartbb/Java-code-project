package com.bahar;

//agar nomre >= 18 shod candid mishi
//agar nomre >= 15 va < 18, age 18 be har dalili enseraf dad, shoma be onvane reserve jaye un miri
//agar < 15: else


public class If_ObjectCreat
{
     float score = 16;

    public static void main( String[] args ) {

        If_ObjectCreat x = new If_ObjectCreat();

        if(x.score >= 18){
            System.out.println("got to be candidated");
        } else if (x.score >=15 && x.score< 18) {
            System.out.println("got to be reserved");
        } else {
            System.out.println("neither candidated nor reserved");
        }

    }
}
