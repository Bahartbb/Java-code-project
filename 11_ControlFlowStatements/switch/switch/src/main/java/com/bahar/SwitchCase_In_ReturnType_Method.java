package com.bahar;

public class SwitchCase_In_ReturnType_Method {

    public static String uniDays(String day){

        switch(day){
            case "Monday":
                return "Monday is a work day for me";

            case "Tuesday":
                return "Tuesday is an uni day for me";

            case "Wednesday":
                return "Wednesday is a work day for me";

            case "Thursday":
                return "Thursday is a work day for me";

            case "Friday":
                return "Friday is a work day for me";

            default:
                return "out of range of working days";

    }
}

    public static void main(String[] args) {

        System.out.println(uniDays("Tuesday"));
        System.out.println(uniDays("Thursday"));
    }
}
