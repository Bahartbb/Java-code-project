package com.bahar;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

//hala inja ebteda yek object az classe morede nazar misazim ta betoonim az tarighe parameter gereftan
//be variable hale un class dastresi dashte bashim
//har argumenti ke unja be constructor dadim, inja mishe behesh dastresi peyda kard

public class Ata_3 {


    public static void main(String[] args) {

        Bahar_3 wifeOfAta = new Bahar_3("bahar" , 33 , true);
        System.out.println(wifeOfAta);

        Bahar_3 status = new Bahar_3(true);
        System.out.println(status);


    }






}
