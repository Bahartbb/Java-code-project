package com.bahar;

//startsWith   endWith
//boolean barmigardoone, true ya false,

public class App 
{
    public static void main( String[] args ) {

        String firstName = "bahar";

        boolean start = firstName.startsWith("ba"); //migi aya ba in shoroo mishe ya na
        System.out.println(start);

        boolean end = firstName.endsWith("ar");  //migi aya ba ar tamoom mishenya na
        System.out.println(end);


        String example = "Mirgalluebayat";

        boolean start2 = example.startsWith("bayat");
        System.out.println(start2);
        

    }
}
