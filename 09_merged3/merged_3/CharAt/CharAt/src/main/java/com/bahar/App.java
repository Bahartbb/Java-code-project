package com.bahar;

//charAt baraye moshakhas kardane in ke har jaygah be kodoom character taalogh dare, be kar mire
//ye string barash moarefi mikonim meghadr midim
//gharare char bargardoone, az methode charAt barash estfade mikonim

public class App 
{
    public static void main( String[] args ) {

    String name = "Ali Zare in China";

    char positionOfCharachter = name.charAt(5);
        System.out.println(positionOfCharachter);



    char positionOfCharacter2 = name.charAt(0);
        System.out.println(positionOfCharacter2);


    char positionOfCharacter3 = name.charAt(3);
        System.out.println("positionOfCharacter is: " + positionOfCharacter3); //fazaye khali ro dad

    }
}
