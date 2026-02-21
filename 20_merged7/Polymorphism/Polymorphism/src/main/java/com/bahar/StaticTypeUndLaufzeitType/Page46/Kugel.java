package com.bahar.StaticTypeUndLaufzeitType.Page46;

//Schlüsselwort: super
//◦ super.<Methode>(<Parameter>);
//◦ super(<Konstruktor-Parameter>);  hamishe bayad avalin khat biad

public class Kugel extends Kreis{


    public Kugel(int radius) {
        super(radius);
    }

    //method zeichne() va gibFlaeche() ro dg neminevisim, yani darim be hamun shekl az Kreis be ers mibarim
    //age mikhastim dar mohasbate method taghiri ijad koim, inja az no mineveshtim


    public void rolle(){
        System.out.println("Kugel is rolled");
    }


    /*public void zeichne(boolean dreiD) {
        if (dreiD) {
            zeichne();
        } else {
            super.zeichne();
        }
    }*/


    public void zeichne(boolean dreiD) {
        if (dreiD) {
            zeichne();   //inja mitunesti super.zeichne() ham begi
        }  else {
            zeichne();   //inja mitunesti zeichne() ham begi, super baraye fahme behtar miad
        }
    }
}
