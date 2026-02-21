package com.bahar;

public class Dackel extends Hund{

    public Dackel(int alter){    //har bar constructor ro misazim ke betunim nemoonei az class ya object besazim
        super(alter);            //dar bahse inheritance mitunim dar sakhtane constutore ba kalameye super be constructore classe pedar dastresi dashte bashim

    }

    public static void main(String[] args) {

        //object misazim chon mikhaym be variable va methodhaye classe pedar va pedar bozorg dastresi dshte bashim
        //chon constructori ke sakhtim voroodi migire, pas in object ham inja voroodi migire

        Dackel waldi = new Dackel(3);   //in object ke misazim be classemoon rabt dare va voroodish mishe voroodie constructore classemoon
                                             //pas bayad vaght mikhaym obj ro besazim bayad age constructoremoon voroodi dare, inja behesh meghdar bedim
        waldi.setAlter(5);
        waldi.bellen();
    }
}
