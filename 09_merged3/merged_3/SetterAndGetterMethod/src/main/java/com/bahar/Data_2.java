package com.bahar;

public class Data_2 {


    private String firstName;
    private String lastName;
    private int age;
    private boolean isMarried;


 //=====================================================================

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

//=====================================================================

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }


    //=====================================================================


    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }


    //=====================================================================


    public boolean getMarried(String answer){
        if (answer == "yes")
            return true;
        else
            return false;
    }

    public void setMarried(){
        this.isMarried = isMarried;
    }
}
