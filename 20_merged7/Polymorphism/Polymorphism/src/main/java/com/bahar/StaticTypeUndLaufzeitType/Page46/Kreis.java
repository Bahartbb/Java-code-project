package com.bahar.StaticTypeUndLaufzeitType.Page46;

import com.bahar.StaticTypeUndLaufzeitType.Page46.Figur;

public class Kreis implements Figur {

  private int radius;


  public Kreis(int radius){
      this.radius = radius;
  }

    @Override
    public void zeichne() {
      System.out.println("zeichnen a Kreis");
    }

    @Override
    public int gibFlaeche() {
        return 0;
    }
}
