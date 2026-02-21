package com.bahar.student_uni;

public class Student {

    //aval az hame bayad ye moteghayer az jense classe Uni inja ijad konim
    private Uni Duisburg_Essen;

    //dependency:
    //method misazim ke rabateye beyne in 2 class ro peyda konim

    private void goingToUni(){
        Duisburg_Essen = new Uni(Student.this);
    }
}
