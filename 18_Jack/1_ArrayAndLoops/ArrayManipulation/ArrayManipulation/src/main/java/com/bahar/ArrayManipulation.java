package com.bahar;


import java.util.Arrays;

public class ArrayManipulation
{

    public static void vertausche(int[] array, int index1, int index2) {

        int temp = array[index1];

        array[index1] = array[index2];

        array[index2] = temp;

    }




    public static void main(String[] args) {

        int[] test = new int[]{100 , 300 , 500 , 700 , 900};   //jaye 500 va 700 avaz she

        vertausche(test,2 , 3 );
        System.out.println("die Ausgabe muss sein, {100 , 300 , 700 , 500} : " + Arrays.toString(test));



    }
}
