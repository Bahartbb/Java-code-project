package com.bahar;


import java.util.Arrays;

public class ArrayVeraendern
{

    public static void change(int[] array , int position , int number) {

        array[position] = number;
    }



    public static void main( String[] args )
    {
        int[] test = new int[] {1,2,3,4,5};
        change(test, 2,42); //chon method void hast nemishe dar sout biad
        System.out.println(Arrays.toString(test));  //Arrays yek classe komaki va baraye kar rooye array estefade mishe
                                                    //baraye chap kardane array bayad az classe Array. estefade konim
                                                    //ke khodesh yek object hast
                                                    //badesh ham toString bokonimesh, chon baraye namayeshe objectha
                                                    //dar java bayad az toSting estefade kard,
                                                    //toString miad araye ro be String tabdil mikone
    }
}
