package com.bahar;

//age nomre balatar az 50 bud, pass age na failed
public class Ternary2 {

    public static void main(String[] args) {

        float score = 45;
        String result = ((score >= 50) ? "you are passed" : "you are failed");
        System.out.println(result);
    }
}
