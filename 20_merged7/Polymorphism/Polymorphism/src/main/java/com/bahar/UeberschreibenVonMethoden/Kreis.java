package com.bahar.UeberschreibenVonMethoden;

public class Kreis implements Figur{

    private double radius;


    //constructor:
    public Kreis(double radius){
        this.radius = radius;
    }

    @Override
    public void zeichne() {

    }

    @Override
    public double gibFlaeche() {
        return Math.pow(this.radius, 2) * Math.PI;
    }
}
