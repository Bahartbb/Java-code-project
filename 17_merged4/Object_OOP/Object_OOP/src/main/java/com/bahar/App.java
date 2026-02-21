package com.bahar;


public class App 
{
   Student alimoradi = new Student();
   Student zakeri = new Student();
   Student rezaei = new Student();


    public static void main(String[] args) {

        App app = new App();

        System.out.println(app.alimoradi.age);

        Student.goToUni();
        Student.isPassed(12.24);

        app.alimoradi.getAge(20);

        Student tbb = new Student();
        tbb.getAge(21);

    }


}
