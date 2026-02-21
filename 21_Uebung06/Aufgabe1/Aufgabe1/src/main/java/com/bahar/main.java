package com.bahar;

public class main {

    public static void main(String[] args) {

//        // a)
//        Y y1 = new Y();
//        Z z = new Z();
//        y1.print();
//        z.print();  //z khodesh print nadare, in print ers borde shode az printe y (parent level1) hast


//        // b)
//        Y y2 = new Y();
//        y2.b(42);
//        y2.print();  //v2 az moteghayer haye classe pedar miad na moteghayere methode b dar classe y

//
//        // c)
//        //X yek abstarct classe,nemishe azash Object sakht, faghta mishe azash ers bari kard, ersbari be soorate zir:
//        // method haye bedoone body piyade saziye ejbari nadaran
//        //ama methodhaye ba body bayad hatman piyade sazi (override) beshan

//
//
//        // d) mesal az khodam:
//
//       //interface ro nemishe asan azash object sakkht, mishe mese zir, ke inam object nist
        //faghat bayad methodhasho inja override konim, bayadi hast
       /* I i1 = new I() {
            @Override
            public void a(int v1) {

            }
        };*/


//      //d

        //I i = new Y(); //Y farzande X va X fazande I hast, pas mishe baraye farzanda Object az classe pedar sakht
        //i.a(7);  //faghat be methode I mitoone darsteri dashte bashe, ke mitune dar classe farzandash implement shode bashe
        //i.print();   //be printe Y nemitoone dastresi dshte bashe,chon pedar ke i bashe nemitune be methode farzand ke Y bashe dastresi dashte bashe
                        //faghat be gharar dadhayi ke dar interface tarif shode dastresi dare
//
//
//        // e)
      //X x = new Z();   //mige x ye Object az Z hast,  //pedar mitoone newyi az farzand bashe va az ghabeliyat haye classe farzand ham estefade kone
      //Z z = new X();   //farzand nemitune newyi az pedar besaze, pedar be farzand dastresi dare, vali farzand be pedar dastresi nadare
      //x.a(55);    //chon new ro rooye Z sakhtim, pas mire v1 ro dar methode a dar Z mikone 55
      //x.print();    //age dar Z print dashtim uno ejra mikard, vali chon nadare, mire print X ro ejra mikone
//
//
//        X x1 = new Y();  //object sakhte az Y,  //pedar mitoone newyi az farzand bashe va az ghabeliyat haye classe farzand ham estefade kone
//                            //pas age ye methodi ro khast, ebteda Y ro check mikone, tu Y nabud mire X ro check mikone
//        x1.a(66);
//        x1.print();    //inja ham chon new az Y hast, aval mire Y ro barresi mikone chon print dare, dg nemire X, hamun print Y ro migire
//        //x1.t(4);   //obj az classe pedar sakhte shode bashe, va methodi (t) faghat dar classe farzand umade,
//                    //un vaght nemishe behesh dastresi peyda kard, chon bayad dar pedar ham bashe
//
//
//        // f)
        Y y = new Z();  //pedar mitoone newyi az farzand bashe va az ghabeliyat haye classe farzand ham estefade kone
        System.out.println("v2=" + y.v2);   //y khodesh v2 nadare, chon v2 dar Z static hast, va nemishe inja azash estefade kard,
                                          // manzooresh pas v2yi ke dar Y hast ro bar midare (az X ers borde shode dar Y)
        y.b(111);   //alan in v2 dar X meghdaresh taghir mikone, vali v1 va v3 ro meghdaresho az methode b dar Y migire
        y.print();









    }
}
