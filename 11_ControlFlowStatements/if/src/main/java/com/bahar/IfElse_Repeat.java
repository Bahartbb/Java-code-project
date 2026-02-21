package com.bahar;

public class IfElse_Repeat {

    //momrehaye daneshjooha az 0 ta 100 hast, mikhaym dar 8 baze barresi beshe
    //0-10: mardood
    //10-30: besyar zaeif
    //30-40: zaeif
    //40-50: motevaset
    //50-60: khoob
    //60-70: kheili khoob
    //70-90: awli
    //90-100: nabeghe

    //baraye piyade sazi az akhar be aval bayad barresi beshe, az sangine be saboke

    public static String studentCheck(float score){

        if(score >= 90 && score <= 100){
            return "the student is genius";
        } else if (score >= 70 && score < 90){
            return "the student is perfect";
        } else if (score >= 60 && score < 70){
            return "the student is very good";
        } else if (score >= 50 && score < 60) {
            return "the student is good";
        } else if (score >= 40 && score < 50) {
            return "the student is average";
        } else if (score >= 30 && score < 40) {
            return "the student is weak";
        } else if (score >= 10 && score < 30) {
            return "the student is very weak";
        } else if (score >= 0 && score < 10) {
            return "the student is failed";
        } else {
            return "out of range";
        }

    }

    public static void main(String[] args) {

        System.out.println(studentCheck(101));
        System.out.println(studentCheck(-5));
        System.out.println(studentCheck(50.5f));  //floating form
        System.out.println(studentCheck(93.4f));  //floating form
    }
}
