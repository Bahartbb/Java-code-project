package com.bahar;


public class Kreis extends GeometrischeFigur //circle
{
      private double radius;

      public Kreis(double radius){
           this.radius = radius;
      }



      public double getRadius() {
            return radius;
      }

      public void setRadius(double radius) {
            this.radius = radius;
      }

      @Override
      public double getFlaeche() {
            return Math.PI*radius*radius;
      }
}
