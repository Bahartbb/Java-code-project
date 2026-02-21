package com.bahar;

//array yek majmooe az anasor hast, vaghti mikhaym roo yek mosht onsor yeseri amaliyat anjam bedim
//behtarin kar estefade az loop hast

import java.util.Arrays;

public class DeleteArray
{
    public static void delete(int[] array){

        for(int i= 0; i < array.length; i++){
            array[i] = 0;
        }
    }



    public static void main( String[] args )
    {

        int[] test = new int[]{1,2,3,4,5};
        System.out.println("Vorher: "+Arrays.toString(test));
        delete(test);
        System.out.println("Nachher: "+Arrays.toString(test));

    }
}
