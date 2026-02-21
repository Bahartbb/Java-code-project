package com.bahar;

//mikhaym baraye sakhtane constructor  az classe person yek object ya instance ya nemoone ijad konim dar classe baghali
//inctance ya object ro dar classe baghali misazim, constructor ro haminja

public class Person_1 {

    private String name;
    private String familyName;
    private int id;
    private double grade;

    //chera constructor misazim? baraye inke vaghti darr classe baghali mikhaym azash estefade konim, betoonim
    //be variable hayi ke inja moarefi kardim, voroodi bedim

    //ijade constructor be halate no Parameter
    //in halate pishfarze java: har classi dar java yek constructore pish farz darad
    public Person_1(){

    }


    //ijade constructor ba parameter (arguments)
    //this eshare dare be class, baraye dastresi dadan be mohtaviate class
    //constructor ro ke sakhti, nega mikoni baste be niyazet tooye classe baghal ke mikhay chia ro print kone, behesh args midi

    public Person_1(String firstName){
        this.name = firstName;     
    }

    public Person_1(String firstName, String lastName){
        this.name = firstName;
        this.familyName = lastName;
    }

    public Person_1(int idNumber){
        this.id = idNumber;
    }

    public Person_1(String name, String familyName, int id, double grade){
        this.name = name;
        this.familyName = familyName;
        this.id = id;
        this.grade = grade;
    }


    public static void main(String[] args) {

    }

    //object ro be string tabdil mikone, (Generate/commandN + toSrting)
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", familyName='" + familyName + '\'' +
                ", id=" + id +
                ", grade=" + grade +
                '}';
    }
}
