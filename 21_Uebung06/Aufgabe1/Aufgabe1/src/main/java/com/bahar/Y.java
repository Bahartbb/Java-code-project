package com.bahar;

public class Y extends X{  //y mishe farzande X, ers bari karde

    int v3 = 33;

    public void b(int v2) {
        v3=this.v2;   //ba this. dare be classe y eshare mikone, vali ba . be ajzaye ghabele darstese classe pedar mituni dastresi dashte bashi
                        //age access modifier : public, protected ya default bashe va too ye package, dastresi hast
                        //this mige in class ba . dare ers mibare az classe pedar (pedar x ke khodesh az y ers mibare)

        v1 = v2;       //vali in v2 marboot be hamin classe, mige v2 in class ro beriz too v1 classe pedar

    }


    public void print() {
        System.out.println("Y: v1=" + v1 + " v2=" + v2 + " v3=" + v3);  //v2 ke dar methode bala estefade shode nemitoone
                                                                        //dar methode print biad, chon un faghat marboot be bodye hamoon methode
    }


}
