package com.bahar;

//ye class darim be esme bahar, va ye seri private variable toosh moarefi kardim
//hala mikhaym az classe baghali be in variable ha dastresi dashte bashim
//baraye inkar bayad ebteda dar hamin class yekseri constructor baste be variable haye modered niyaz dar classe baghali besazim
//constructor ro be soorate public EsmeClass() misazim
//baraye arguments mibinim classe baghal chi mikhad hamoona ro behesh midim
//bad ba estefade az this. migim ke un variable haye bala tarif shode ba argumente constructor barabar hastan
// edame dar classe baghal

public class Bahar_3 {

    private String name;
    private int age;
    private boolean isMarried;


    public Bahar_3(boolean isMarried){
        this.name = name;
    }

    public Bahar_3(String name, int age, boolean isMarried){
        this.name = name;
        this.age = age;
        this.isMarried = isMarried;
    }




    @Override
    public String toString() {
        return "Bahar_3{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isMarried=" + isMarried +
                '}';
    }
}
