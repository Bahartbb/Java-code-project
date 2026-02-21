package com.bahar.TutorialUseOfArray;

public class useOfArryas {

    //array: ye list az yek seri element ke type e yeksan daran
    //syntax of Array:

    // access modifier + non/static/final + data type + [] + arrayName + = + { meghdare array } + ;

    static int[] age = {12, 14, 16};

    //_____________________________________________________

    public String[] name = {"gfv" , "chg"};


    //ravehse badi baraye ijade array:

    String[] postalcode = new String[20];

    //_______________________________________________________

    String[] city = new String[] {
            "Tehran",
            "Rasht",
            "Tabriz",
            "Isfahan"
    };

    public static void main(String[] args) {

        String[] familyName = new String[2];

        //meghdar dehi be har index dar yek array
        familyName[0] = "hgjg";
        familyName[1] = "tres";
        familyName[2] = "treswe";
    }



}
