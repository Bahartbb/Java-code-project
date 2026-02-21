package com.bahar;

import java.awt.*;

public class Wecker_conclusion {
    Color farbe = Color.BLACK;
    String uhrzeit = "00:00";
    String Weckzeit = "00:00";
    int hoehe = 10;
    int breite = 10;
    int tiefe = 10;
    boolean istDigital;
    boolean istAn;

//alan constructore class ro misazim ta betoonim object ijad konim dar classe dige (ba voroodi ya bi voroodi)

    public Wecker_conclusion(){

    }

// hala mikhaym ye constructor besazim ke voroodi migire

    public Wecker_conclusion(Color farbe, String uhrzeit, String weckzeit,
                             int hoehe, int breite, int tiefe, boolean istDigital, boolean istAn){
        this.farbe = farbe;
        this.uhrzeit = uhrzeit;
        this.Weckzeit = weckzeit;
        this.hoehe = hoehe;
        this.breite = breite;
        this.tiefe = tiefe;
        this.istDigital = istDigital;
        this.istAn = istAn;
    }

}
