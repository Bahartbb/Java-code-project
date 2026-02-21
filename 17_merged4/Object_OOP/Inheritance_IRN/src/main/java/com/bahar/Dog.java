package com.bahar;

import java.security.PrivateKey;

public class Dog extends Animal {

//ba ye kalemeye esxtend clase dog hameye moshakhasate marboot be animal ro be res mibare
    private String smell;
    private String loyal;


    public Dog(){

    }


    public String getSmell() {
        return smell;
    }

    public void setSmell(String smell) {
        this.smell = smell;
    }

    public String getLoyal() {
        return loyal;
    }

    public void setLoyal(String loyal) {
        this.loyal = loyal;
    }




    public static void main(String[] args) {

    //baraye estefade az method haye mojood dar superclass:
    //kafie ke esme classe hale hazer ro biyarim be ezafe . , chon in class alan dar vaghe ba un class barabari mikone
    //ba extends kari kardim harch animal dasht, dog ham dashte bashe, pas esme dog ro miyarim

   //faghat inke chon method ha static hastan, dg niyaz be sakhtane object baraye call kardan nist,
   //faghat esme khode class ro miyarim

        Dog.eat("DogEating");
        Dog.move("DogMoving");

        //alan mikhaym be variable ha dastresi peyda konim, ke niyaz be dastresi be setter gettere un class darim
        //alan mikhaym be setter ve getter dastresi dashte bashim,
        //aval az hame object misazim az classe hale hazer
        //chon static nistan, bayad az esme objecti ke sakhtim baraye call kardan estefade konim

        Dog dog = new Dog();

        dog.setAge(2);
        System.out.println("the age of the dog is: " + dog.getAge());
    }

    public static void smell(String dogSmell){
        System.out.println("dog is smelling: " + dogSmell);
    }
}
