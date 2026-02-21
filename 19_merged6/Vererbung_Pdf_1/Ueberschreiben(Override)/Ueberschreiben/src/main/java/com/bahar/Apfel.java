package com.bahar;

public class Apfel extends Obst{

    protected boolean hatWurm = false;

    public boolean istGenieebar() {
        return istReif && !hatWurm;
    }
}
