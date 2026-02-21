package com.bahar;

public class Hund extends Saugetier {

    //inja bayad constructor besazi baraye inke betuni extends koni
    //voroodiye constructor bayad ba voroodihaye constructore pedaresh(saugetier) yeki bashe
    public Hund(int alter){
        super(alter);       //super be ma dastresi be classe pedar ro mide
                            //manzoor az super hamoon constructore pedar hast, kolle constructori ke unja neveshtim
    }


    public boolean zeugungsfaehig(){
        if(alter > 1){        //in alter az classe pedar(Saugetier) gerefte shode va chon unja alter be soorate protected moarefi shode, pas dar sathe package behesh dastresi darim va niyaz be setter getter nist
            return true;
        }else {
            return false;
        }
    }


    public void bellen(){
        System.out.println("Wuff!");
    }

}
