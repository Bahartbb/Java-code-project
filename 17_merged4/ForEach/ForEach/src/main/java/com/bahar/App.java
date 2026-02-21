package com.bahar;


public class App 
{
    public static void main( String[] args )
    {
        //halgheye for each ya har halgheye digari bayad dar bodye method moarefi beshe

        int[] numbers = {7,6,9,8,76,5,4,3,6,65,454,65,65,54};

        //baraye print kardane in array 2rah darim:
        //for(i) and for(each): baraye chap kardne kolle azaye majmooe bedoone sharte khsi

        //for(i)
        for (int i=0 ; i<numbers.length ; i++){
            System.out.println("the array includes: " + " " + numbers[i]);
        }


        //for(each)
        //for(datatype name : arrays){
        //   sout(name);
        //   }
        for (int num : numbers){
            System.out.println("the array includes: " + " " + num);
        }
    }
}
