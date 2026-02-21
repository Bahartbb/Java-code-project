package com.bahar;

//mikhaym inja be variable haye classe bahar dastresi peyda konim
//aval setter ro minevisim, badesh getter
//age setter ro nanvisi, getter ejra nemikone

public class App 
{
    public static void main( String[] args ) {

        Bahar bahar = new Bahar();   //ye nemoone object az classe bahar ijad kardim

        bahar.setName("sara");   //chon setName khodesh dar classe bahar voroodi migire, nemitooni inja dar sout bezarish
        System.out.println(bahar.getName()); //baraye gereftane name, esme object ro bezan ba . bad entekhab kon kodoom

        bahar.setFamilyName("rezayi");
        System.out.println(bahar.getFamilyName());

        bahar.setAge(33);
        System.out.println(bahar.getAge());

        bahar.setBirtDate("23.09.1991");
        System.out.println(bahar.getBirtDate());

        bahar.setAddress("velberter Strasse 40");
        System.out.println(bahar.getAddress());

        bahar.setPostalCode("40227");
        System.out.println(bahar.getPostalCode());

        bahar.setIdNumber("12345678");
        System.out.println(bahar.getIdNumber());

        bahar.setPhoneNumber("01635176551");
        System.out.println(bahar.getPhoneNumber());




    }
}
