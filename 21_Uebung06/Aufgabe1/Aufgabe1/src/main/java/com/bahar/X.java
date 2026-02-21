package com.bahar;

//vaghti dari yek interface ro implement mikoni, bayadi hast ke method hasho hamaro biari(override)
//baraye methodha bayad body bezari ke betuni piyade saz koni
//mituni methode mojaza baraye khode in class ham benevisi (ke overrdie dg nist)


public abstract class X implements I {

    protected int v1 = 70;
    public int v2 = 20;

    @Override
    public void a (int v1){
        v2 = v1;
    }

    public void print() {
        System.out.println("X: v1=" + v1 + "v2=" + v2);
    }
}
