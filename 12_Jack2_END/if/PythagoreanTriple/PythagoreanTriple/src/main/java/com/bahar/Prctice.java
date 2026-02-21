package com.bahar;

//Pythagoreisches Tripel:
// a^2+b^2=c^2
public class Prctice {

    public static void main(String[] args) {

        Prctice triple = new Prctice(); //yek object az classe Prachtice misazim ke betunim ba esme un object(triple) be datahaye methode payin ba . dastresi dashte bashim

        System.out.println(triple.pythagoreischesTripel(3,4,5));
        System.out.println(triple.pythagoreischesTripel(20,21,29));
        System.out.println(triple.pythagoreischesTripel(1,2,3));

    }

    public boolean pythagoreischesTripel (int a, int b, int c) {

        int assignedLeft1 = (int)Math.pow(a,2);
        int assignedLeft2 = (int)Math.pow(b,2);
        int assignRight = (int)Math.pow(c,2);
        int assignLeftTotal = assignedLeft1 + assignedLeft2;

        if(assignLeftTotal == assignRight){
            return true;
        } else {
            return false;
        }
    }

}
