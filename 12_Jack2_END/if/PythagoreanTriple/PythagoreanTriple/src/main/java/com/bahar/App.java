package com.bahar;

//In this exercise, you are to determine whether three numbers are a so-called Pythagorean triple.
//Three numbers a, b, and c are a Pythagorean triple if and only if a^2 + b^2 = c^2.

public class App
{
    public static void main( String[] args )

    {
        App triple1 = new App();
        System.out.println(triple1.triple(3,4,5));
        System.out.println(triple1.triple(20,21,29));
        System.out.println(triple1.triple(1,2,3));
    }

    //in bar method static moarefi nmikonim, ke ba object sazi dar main betunim call konim in method ro

    public boolean triple (int a, int b, int c){
        int assignLeft1 = (int)Math.pow(a,2);   //aˆ2
        int assignLeft2 =(int)Math.pow(b,2);   //bˆ2
        int assignRight = (int)Math.pow(c,2);  //cˆ2
        int assignLeftTotal = assignLeft1 + assignLeft2;   // result= aˆ2 + bˆ2
        //System.out.println("assignLeftTotal: " + assignLeftResult);
        //System.out.println("assignRight: " + assignRight);

        if(assignLeftTotal == assignRight){
            return true;
        }

        else {
            return false;
        }
    }

}
