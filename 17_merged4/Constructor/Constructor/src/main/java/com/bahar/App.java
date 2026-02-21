package com.bahar;

//formula baraye ijade constructor:
//1- constructor dar badaneye class ijad mishe na dar method
//2- type e constructor az khode jense class hast
//3- az noe return type ya void, manande methodhaye java nist
//4- syntax: access modifier + jense class (data type) + () + { + code +  }

public class App 
{
    int age;

    public App(){

        age = 20;   //har bar azin be bad age moarefi shod va behehsh meghdar dade nashod, meghdare pishfarze 20 barahs dar nazar gerefte mishe
        System.out.println(age);

    }

    @Override
    public String toString() {
        return age + "";
    }
}
