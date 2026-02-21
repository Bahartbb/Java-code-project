package com.bahar;

public class GermanDog extends Dog{ //az classe Dog ers mibare, chon Dog az Animal ers mibare pas az Animal ham ers mibare

    private String originGerman;
    private String skinColorGerman;




    public String getOriginGerman() {
        return originGerman;
    }

    public void setOriginGerman(String originGerman) {
        this.originGerman = originGerman;
    }

    public String getSkinColorGerman() {
        return skinColorGerman;
    }

    public void setSkinColorGerman(String skinColorGerman) {
        this.skinColorGerman = skinColorGerman;
    }

    public static void main(String[] args) {

        GermanDog.eat("germanEating");  //az classe aval yani Animal, ama az tarighe Dog
        GermanDog.move("germanWalking");    //az classe aval yani Animal, ama az tarighe Dog
        GermanDog.smell("germanSmelling"); //az classe 2vom yani Dog, mostaghim



        //setter getter mizarim ke be variable haye mojood dar Dog va Animal dstresi peyda konim
        //va baraye object germant setteshoon konim

        GermanDog germanDog = new GermanDog();

        germanDog.setName("Loosy"); //Animal
        System.out.println("the name of the dog is: " + germanDog.getName());  //Animal

        germanDog.setAge(7);        //Animal
        System.out.println("the age of the dog is: " + germanDog.getAge());     //Animal

        germanDog.setLoyal("it is loyal");              //Dog
        System.out.println(germanDog.getLoyal());       //Dog

        germanDog.setSmell("the dog smells good");  //Dog
        System.out.println(germanDog.getSmell());   //Dog
    }


    public void fastMovingGermanDog(String moving){
        System.out.println("german dog runs fas: " + moving);
    }


    public void resistanceGermanDog(String resistance){
        System.out.println("germanDog has a good resistance: " + resistance);
    }

}
