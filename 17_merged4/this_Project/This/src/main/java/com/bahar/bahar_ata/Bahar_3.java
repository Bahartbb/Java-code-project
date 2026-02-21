package com.bahar.bahar_ata;

//bahar daraye yek seri variable va method hast,
public class Bahar_3 {

    private int age;
    private String City;
    private String birthDate;

    //yek moteghayer az jense classe Ata darim:

    private Ata_3 husband;

    //baraye inke in 2 class ro be ham rabt bedim bayad yek method az jense classe baghali inja va yek constructor az jense in class dar calsse baghali ijad konim
    //ya bar ax
    public Bahar_3(Ata_3 husband){

        this.husband = husband;
    }


    //1 constructor ijad mikonim(bedoone voroodi):

    public Bahar_3(){
        this.age = 30;
        this.birthDate = "23.09.1991";
        this.City = "Duesseldorf";
    }

    //1 ta constructor ijad mikonim (ba 1voroodi):

    public Bahar_3(int age){
        this.age =age;
    }


    //1 ta constructor ijad mikonim (ba 2voroodi):

    public Bahar_3(String City , String birthDate){

        this.City = City;
        this.birthDate = birthDate;
    }

    public Bahar_3(int age , String City){

        this.age = age;
        this.City = City;

    }

    //1 ta constructor ijad mikonim (ba 3voroodi):

    public Bahar_3(int age , String City , String birthDate){

        this(25,"Rasht");
        this.eat();
        this.age = age;
        this.City = City;
        this.birthDate = birthDate;
    }



    public String study(){
        this.eat();
        return "I am studying";
    }

    public String eat(){
        return "I am eating";
    }

    public void doSport(){
        System.out.println("I am doing sport");
    }


}
