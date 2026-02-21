package com.bahar;

//subString : az String tarif shode, yek sub misaze,
//yani to eshare mikoni kodoom bakhsha ro hazf kon, baghie baghi mimoone
public class App
{
    public static void main( String[] args )
    {

        String example = "one two three";

        String subString = example.substring(0); //hichio hazf nakon
        System.out.println(subString);

        String subString2 = example.substring(1);  //az 1 be bad ro chap kon
        System.out.println(subString2);


        String subString3 = example.substring(3);  //0,1,2, ro hazf kon, az 3 be bad ro negah dar chap kon
        System.out.println(subString3);

        String subString4 = example.substring(4, 8);   //beyne 4 ta 8 ro negah dar, mabaghi ro hazf kon
        System.out.println(subString4);

        String subString5 = example.substring(8);   // ta 8 ro hazf kon mabaghi roo negah dar
        System.out.println(subString5);

        String substring6 = example.substring(7);  //az 7 be bad ro chap kon(negah dar)
        String substring7 = example.substring(4,8);          
        System.out.println(substring6 + " " + substring7);

    }
}
