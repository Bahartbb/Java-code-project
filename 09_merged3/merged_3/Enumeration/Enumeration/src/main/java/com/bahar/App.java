package com.bahar;


public class App
{
    public static void main( String[] args ) {

/*  enum baraye sakhtane ye seri data type estefade mishe ke tedadeshoon moshakhas va sabet hast,
    mesle faslha, roozaye hafte, vaziyate hava va ...


        Enum3 spring, summer, autumn, winter;
*/

        App_Enum3 spring;
        App_Enum3 summer;
        App_Enum3 autumn;
        App_Enum3 winter;

        spring = App_Enum3.SPRING;
        summer = App_Enum3.SUMMER;
        autumn = App_Enum3.AUTUMN;
        winter = App_Enum3.WINTER;

        if(spring == App_Enum3.SPRING){
            System.out.println("first season is spring");
        } else {
            System.out.println("other seasons");
        }

        //______________________________________________________________________


        App_Day today;
        App_Day yesterday;

        today = App_Day.FRIDAY;
        yesterday = App_Day.THURSDAY;

        if(today == App_Day.FRIDAY){
            System.out.println("soon it is weekend");
        } else {
            System.out.println("soon it is not weekend");
        }
        //________________________________________________________

        App_Enum2 ali = App_Enum2.MANAGER1;
        App_Enum2 reza = App_Enum2.MANAGER2;
        App_Enum2 sara = App_Enum2.MANAGER3;

        if(ali == App_Enum2.MANAGER1){
            System.out.println("He is the boss");
        }  if (reza == App_Enum2.MANAGER2) {
            System.out.println("Reza is sub manager");
        }  if(sara != App_Enum2.MANAGER3) {
            System.out.println("this result is false");
        } else {
            System.out.println("non of the above is correct");
        }


    }





}
