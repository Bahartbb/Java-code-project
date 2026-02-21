package com.bahar;


//true while baraye in hast ke halgheye while be soorate daem va hamishegi dar un barname kar kone

//halgheyi benivisid ke dastoore name bahar ro be soorate daem chap kone va ta zamani ke behesh gofte nashode motevaghef nashe

import java.util.Scanner;

public class WhileTrue {

    public static void main(String[] args) {

        Scanner yourInput = new Scanner(System.in);  //baraye inke sharte khorooj az infinite loop ro dashte bashim, niyaz be in darim ke karbar ye chizi vared kone

        while (true){

            System.out.println("please insert your name or to exit the program enter 0");
            String name = yourInput.nextLine();
            System.out.println("name: " + name);

            if (name.equals("0")){
                System.out.println("you exited the program");
                return;
            }

        }

    }

}
