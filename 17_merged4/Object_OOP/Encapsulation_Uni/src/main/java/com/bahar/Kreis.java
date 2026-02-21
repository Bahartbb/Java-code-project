package com.bahar;

//yek class ba moshakhasate encapsulation tarif shode ke daraye 3 ozve aslie
//1- varibale ha, 2- counstructor, 3- methode setter baraye radius
//ye constructor misazim ke toosh be jaye this az setter (setzeRadius) estefade mikonim

public class Kreis {

    private int radius = 1;
    private float flaeche;


//vazifeye asliye constructor meghdar dehi kardane moteghayer haye sathe class hast (moteghayerhaye non static)
    public Kreis(int radius){
        setzeRadius(radius);  //in az methode settere payin gerefte shode
                            //chera in kar? be jaye this. az setter estefade konim
                            //halathaye ba this. bedoone shart bud, vali alan mikhaym sharte setter ro estefade konim
                            //baraye hamin be jaye this. ino miyarim
                            //yani age sharte setter bargharar nabashe nemishe, constructor ro vabaste karde be sharte setter
    }


    
    //setter method: (methode setter ro sharti neveshte)
    public void setzeRadius (int radius){
        if (radius >= 1 ){
            this.radius = radius;
            berechneFlaeche();  //ye method ham inja call karde
        }
    }

    private void berechneFlaeche() {
        System.out.println("call berechneFlaeche");
    }


    public static void main(String[] args) {
        //chon constructor sakhtim, va constructoresh voroodi migire, hala objecti k baraye class misazim ham hamoon voroodi ro migire
        Kreis kreis = new Kreis(67);   //constructor ba object class dar ertebat, ke miyad objecte sakhte shode az class ro meghdar dehi mikone

        kreis.setzeRadius(55);   //parameterhaye class ro meghdar dehi mikone

    }

}
