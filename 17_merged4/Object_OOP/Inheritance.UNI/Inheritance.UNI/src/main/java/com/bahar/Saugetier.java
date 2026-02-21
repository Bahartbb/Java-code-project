package com.bahar;


public class Saugetier
{   protected int alter;    //chera protected? faghat dar sathe package baraye barname nevis dar dastras bashe

    public Saugetier(int alter){
        setAlter(alter);
    }

    public void setAlter(int alter){
        if(alter > 0){
            this.alter = alter;
        }
    }


    public static void main(String[] args) {

        Saugetier[] tierfarm = new Saugetier[6];  //6 neshoon dahandeye zarfiaye array hast
        tierfarm[0] = new Hund(3);      //khooneye 0 array new az classe Hund hast, chon voroodi unja alter hast inja bayad meghdar bedim,meghdar dadan be array injoorie too java 
        tierfarm[1] = new Katze(2);
        tierfarm[2] = new Schaf(4);
        tierfarm[3] = new Schaf(5);
    }



}
