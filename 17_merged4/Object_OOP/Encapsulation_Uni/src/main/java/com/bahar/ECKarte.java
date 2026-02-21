package com.bahar;


import java.util.Arrays;

public class ECKarte
{

    private String inhaber;
    private int pin;
    private double kontostand;
    private String[] transaktionen;


    //constructor
    public ECKarte(String inhaber, int pin, double kontostand) {

        this.inhaber = inhaber;
        this.pin = pin;
        this.kontostand = kontostand;

    }

    //private methods
    //Interne Methode - private deklariert, kein direkter Zugriff von aussen
    //in method kharej az in class emkane dastresi behesh nist, baraye inke betunim dar methodhaye payin azash estefade konim inja sakhtimesh
    private boolean pruefePIN(int pin){
        return (this.pin == pin);    //hamoon if hast
    }


    //zugriffsmethoden - public deklariert  ----> public methods
    public double gibKontostand(int pin) {
        if(pruefePIN(pin) == false){

            //fehlerbehandlung
        }
        return kontostand;
    }

    public String[] gibTransaktionen(int pin) {

        if (pruefePIN(pin) == false) {

            //fehlerbehandlung
        }
        return transaktionen;

    }


    //getter va setter benevisim baraye inhaber

    public String getInhaber(){    //getter dar signature khod voroodi nadare
        return this.inhaber;
    }

    public void setInhaber(String inhaber) {    //ama setter voroodi dare dar signature khode, va un meghdare voroodi ro miad set mikone
        this.inhaber = inhaber;
    }
}
