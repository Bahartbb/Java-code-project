package com.bahar;

/**
 * Hello world!
 *
 */
public class App 
{ //az ina ta curly brackete basteye payin mishe scope e APP


    public static void main( String[] args ) { //in {} curly brackets e baz baste mishe scope e in method, yani methode main
                                                //hameye codehaye neveshte shode dar har scope faghat mitoonan dar charchoobe ghavanine hamoon scope tarif beshan


        System.out.println( "Hello World!" );


    }

    public void getSms(String sms) {
        System.out.println(sms);


    } //inja yek methode dige dar scope e class APP tarif kardim
      //in nahiye mishe scope e getSms



}
