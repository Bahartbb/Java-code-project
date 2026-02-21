package com.bahar;

public class Aplfel2 extends Obst {

    protected boolean hatWurm = false;

    public boolean istGenieebar() {
        return super.istGeniessbar() && !hatWurm; //ba neveshtane super. be har chi too superclass hast dastresi dari
    }                                             //baraye be ers bordane method az superclass bayad az kalameye kilidiye super estefade konim
                                                  //faghat age chizi private moarefi shode bashe ba super nemishe, hatman setter getter dar superclass mikhad
}
