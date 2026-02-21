package com.bahar;

//tamame variable ha dar classe halate encapsulation bayad private tarif beshan

//agar bekhay az classe dge be variable haye class ke private ijad shodan  dastresi dashte bashi,
// mituni az tarighe methodhaye setter va getter be in variable ha dastresi dashte bashi
//yani bayad baraye hameye variable ha setter va getter ijad koni

public class Student
{
    private int id;
    private String name;
    private static String family;
    //protected String city;    //in ghalate chon baraye encapsulation, faghat private mishe
    public String postalCode;   //in ghalate chon baraye encapsulation, faghat private mishe
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getFamily() {
        return family;
    }

//baraye ijade setter baraye variable ke besoorate static moarefi shode, dige nemtunim begim this
//bale bayad az esme class . estefade konim
//tooye signature methodesh ham static dare

    public static void setFamily(String family) {
        Student.family = family;
    }

    public static void main(String[] args) {

    }

}

