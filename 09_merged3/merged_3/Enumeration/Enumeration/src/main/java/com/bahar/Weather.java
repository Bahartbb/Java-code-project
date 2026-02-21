package com.bahar;

//enum baraye sakhtane ye seri data type estefade mishe ke tedadeshoon moshakhas va sabet hast,
//mesle faslha, roozaye hafte, vaziyate hava va ...

public class Weather {

    public static void main(String[] args) {

        Weather_Enum today = Weather_Enum.snowy;

        if (today == Weather_Enum.sunny){
            System.out.println("the weather is nice today");
        } else {
            System.out.println("the weather is SCHEISSE");
        }


    }
}
