package com.bahar.AmoozesheEquals;

public class Amoozeshe_equalsMethod {

    double garde;

    //mikhaym bebinim aya classe Test yek nemoone az object hast ya na
    public boolean equals(Object obj){
        return (obj instanceof Amoozeshe_equalsMethod);

    }


    public boolean equals1(Object obj){
        return (obj instanceof Amoozeshe_equalsMethod) &&
                ((Amoozeshe_equalsMethod)obj).garde == this.garde;
    }

    public static void main(String[] args) {

        Amoozeshe_equalsMethod test = new Amoozeshe_equalsMethod();

        System.out.println(test.equals(test));;
    }
}
