package com.bahar;

public class SwitchCase_In_Void_Method {

    public static void uniDay(String day) {

        switch (day) {
            case "Monday":
                System.out.println("Monday is a work day for me");
                break;

            case "Tuesday":
                System.out.println("Tuesday is an uni day for me");
                break;

            case "Wednesday":
                System.out.println("Wednesday is a work day for me");
                break;

            case "Thursday":
                System.out.println("Thursday is a work day for me");
                break;

            case "Friday":
                System.out.println("Friday is a work day for me");
                break;

            default:
                System.out.println("out of range of working days");
                break;
        }
    }

    public static void main(String[] args) {

        uniDay("Monday");
        uniDay("Saturday");
    }
}
