package com.bahar;

public class Info_3 {

    private String subject;
    private double grade;
    private boolean isPassed;

//=====================================================================


    public String getSubject(){
        return subject;
    }


    public void setSubject(String subject){
        this.subject = subject;
    }


//=====================================================================


    public double getGrade(){
        return grade;
    }


    public void setGrade(double grade){
        this.grade = grade;
    }

//=====================================================================


    public boolean getIsPassed(double grade){

        if (grade < 1 || grade > 4)
            return false;
        else
            return true;

    }

    public void setIspassed(boolean isPassed){
        this.isPassed = isPassed;
    }








}
