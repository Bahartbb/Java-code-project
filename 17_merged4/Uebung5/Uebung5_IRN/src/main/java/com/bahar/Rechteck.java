package com.bahar;

public class Rechteck extends GeometrischeFigur {     //rectangle

    private double laenge;
    private double breite;

    public Rechteck(double laenge, double breite){
        this.breite = breite;
        this.laenge = laenge;
    }

    public double getLaenge() {
        return laenge;
    }

    public void setLaenge(double laenge) {
        this.laenge = laenge;
    }

    public double getBreite() {
        return breite;
    }

    public void setBreite(double breite) {
        this.breite = breite;
    }

    @Override
    public double getFlaeche() {
        return laenge*breite;
    }
}

