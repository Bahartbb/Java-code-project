package com.bahar;

public class Dreieck extends GeometrischeFigur {   //triangle

   private double hoehe;
   private double laenge;

   public Dreieck(double hoehe, double laenge){
       this.hoehe = hoehe;
       this.laenge = laenge;
   }

    public double getHoehe() {
        return hoehe;
    }

    public void setHoehe(double hoehe) {
        this.hoehe = hoehe;
    }

    public double getLaenge() {
        return laenge;
    }

    public void setLaenge(double laenge) {
        this.laenge = laenge;
    }

    @Override
    public double getFlaeche() {
        return 0.5*laenge*hoehe;
    }
}
