package com.bahar;


public class SwitchCase_In_MainMethod_With_Numbers {

    public static void main(String[] args) {

        int day = 4;

        switch (day){
            case 1:
                System.out.println("1: Monday is not a working day");
                break;

            case 2:
                System.out.println("2: Tuesday is not a working day");
                break;

            case 3:
                System.out.println("3: Wednesday is not a working day");
                break;

            case 4:
                System.out.println("4: Thursday is a working day");
                break;

            case 5:
                System.out.println("5: Friday is not a working day");
                break;

            case 6:
                System.out.println("6: Saturday is not a working day");
                break;

            case 7:
                System.out.println("5: Sunday is not a working day");
                break;

            default:
                System.out.println("out of range");

        }

    }
}
