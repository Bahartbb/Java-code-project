package com.bahar;

public class Z extends Y{

    public static int v2 = 8;
    private int v3 = 40;

    public void a (int v1) {
        super.a(v1);  //super ke minvisi yani be classe pedare pedar(X) darstesri dari, yani be methode a
                      //voroodie method nemitune az classe pedar bashe, az hamin method mitune voroodi begire
                        //kollan be moteghayere tarif shode dar scope methode classe dg (pedar) dastresi nadare,
                        //yani vaghti inja vorudie method v1 hast faghat mituni ba super sz v1 estefade koni

        this.v1 = v1;  //ba this. darim ebteda be motagheyere sathe hamin class eshare mikonim(classe Z)
                        //vaghti dar in class v1 nadarim mire be classe pedarhash eshare mikone, va voroodie v1 dar in method ro
                        // mirize too motagheyer v1 az classe pedar(X)
                        //kollan samte raste mosavi eshare dare be vorudie method, samte chape mosavi eshare dare be
                        // moteghayere sathe hamin class ya classe pedarhash
    }
}
