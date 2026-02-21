package com.bahar.UeberladenVonMethoden;

//esm va type method yekie, parameter type yekie vali tedadeshoon bayad fargh kone

public class Overload1
{
   public int addiere(int summand1 , int summand2) {
       return summand1 + summand2;
   }

   public int addiere(int summand1, int summand2 , int summand3) {
       return summand1 + summand2 + summand3;
   }


   public int addiere(int summand1, int summand2 , int summand3, int summand4) {
       return summand1 + summand2 + summand3 + summand4;
   }



    //esm va type method yekie, va voroodiha az lahaze type va tedad motefavet bashan


   public int addiere(double summand1){
       return (int) summand1;
   }


   public int addiere(){
       return 100;
   }


   public double addiere(double summand1 , int summand2){
       return summand1 + summand2;
   }


   public void addiereTest() {

       //inja amale overload (ueberladen) ettefagh miofte

       addiere(1, 2, 3);
       addiere(4, 5);
       addiere(6, 7, 8, 9);
       addiere(10.27);
       addiere();
       addiere(12.02, 7);
   }

}
