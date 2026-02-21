package com.bahar;


import java.util.Arrays;

public class ArraysAndLoops
{
    public static int[] duplicateElements(final int[] elements){

        int[] duplicated = new int[elements.length*2];
        int newElement = 0;

        for(int i =0 ; i < elements.length ; i++){

            duplicated[newElement++] = elements[i];
            duplicated[newElement++] = elements[i];
        }




        return duplicated;
}

    public static void main(String[] args) {

        int[] array = new int[]{0 , 1 , 2 , 3};
        System.out.println(Arrays.toString(duplicateElements(array)));
    }
}
