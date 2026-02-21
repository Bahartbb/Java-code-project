package com.bahar.Amoozeshe_Super;

//super marboot be bahse inheritance hast va miad rabeteye beyne 2class ro neshoon mide,
//pas zamani tarif mishe ke rabeteye ersbari beyne 2ta class bashe
//kalameye kilidye super dar classe farzand (subclass) miad

//mavarede estefade:
//dastresi be variable haye classe pedar, vaghti variablei dar classe pedar va farzand ham nam bashan  super.variableName
//baraye call kardane methodhaye class pedar, age methode classe pedar dar farzand override shode bashe va dastresi be noskhe method class pedar niyaze  super.methodName
//baraye farakhaniye constructore classe pedar

//nokat:
//bayad avalin dastoor dar constructore classe farzand bashe,agar mikhay const. pedar ro call koni
//faghat be public methods/variables va protected methods/variables az pedar dastresi dari
//nemishe dar class hayi ke hich valedi nadaran, mesle Object esrefade kard



public class Child extends Parent {

    private String childName;

//vaghti extends mikone (ers mibare) ejbaran hamoon aval bayad constructore classe pedar ro be ers bebare




    //contructor ba voroodiye moteghayere delkhah tarif shode dar argument:
    public Child(int age, int score){
        super("sara");
        int result = age * score;
        System.out.println("the result is: " + result);
    }



    //contructor ba voroodiye moteghayere sathe class:
    public Child(String childName){   //voroodiye constr. farzand 2 halat dare: 1- bar asase moteghayer haye sathe classe farzand(instance) inja childname, 2-mituni dar voroodi har datatype + variable delkhahi bedi
        super("ali");         //dar supre tamame voroodihaye contructore pedar meghdar migiran


    }


    @Override
    public String toString() {
        return "Child{" +
                "childName='" + childName + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Child child = new Child("bahar");

        System.out.println(child.toString());

    }


    public void print(){
        System.out.println(super.age);

        super.isMarried(true);
    }
}


