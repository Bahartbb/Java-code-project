package com.bahar;

public class MainUse {

    public static void main(String[] args) {

        Student mainApp = new Student();

        mainApp.setId(22);     //set hamishe tanha miad
        System.out.println(mainApp.getId());  //get hamishe dar sout miad

        mainApp.setName("Bahar");
        System.out.println(mainApp.getName());

//baraye inke variable ke be soorate static moarefi shode bud, betunim setter va getteresh
//ro inja seda kodim, dg lazem nist az object estefade konim
//az tarighe esme khode classesh behesh dastresi peyda mikonim
        Student.setFamily("tbb");
        System.out.println(Student.getFamily());
    }

}
