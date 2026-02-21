package com.bahar;

import java.awt.*;

public class Wecker_conclusion_psvm {

    public static void main(String[] args) {

    //baraye object sakhtan aval yek constructor sakhtim bad yek object az class sakhtim
        Wecker_conclusion standardWecker = new Wecker_conclusion();


    //ye object mikhaym besazim va az constructore ba voroodi estefade konim
        Wecker_conclusion einfachGruen = new Wecker_conclusion(Color.green, "10:00", "07:00", 100 ,200, 50, true, false);

        Wecker_conclusion einfachRot = new Wecker_conclusion(Color.red, "17;23","07:00", 100 ,200, 50, true, false);

        Wecker_conclusion retroDigital = new Wecker_conclusion(Color.black, "23:30", "06:30", 12, 9, 8, true, true);
    }
}
