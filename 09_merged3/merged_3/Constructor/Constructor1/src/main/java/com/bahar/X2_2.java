package com.bahar;

public class X2_2 {

    private String name;
    private String familyname;
    private int id;
    private double grade;



    public X2_2(String firstname){
        this.name = firstname;
    }

    public X2_2(int idNumber , double score){
        this.id = idNumber;
        this.grade = score;
    }

    @Override
    public String toString() {
        return "X2{" +
                "name='" + name + '\'' +
                ", familyname='" + familyname + '\'' +
                ", id=" + id +
                ", grade=" + grade +
                '}';
    }

    public static void main(String[] args) {


    }
}
