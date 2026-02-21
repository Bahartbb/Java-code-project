package com.bahar;

public class Banane extends Obst{

    protected boolean istGruen = false;

    public Banane(boolean istGruen){
        this.istGruen = istGruen;

        if (istGruen == true) {
            istReif = false;
        }
    }
}
