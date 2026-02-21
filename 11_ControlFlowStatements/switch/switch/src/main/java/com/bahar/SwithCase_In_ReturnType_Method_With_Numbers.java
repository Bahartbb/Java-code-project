package com.bahar;

public class SwithCase_In_ReturnType_Method_With_Numbers {

    public static int workingDays(int day){

        switch (day){
            case 1:
                System.out.println("1: Monday is not a working day");
                return 1;

            case 2:
                System.out.println("2: Tuesday is not a working day");
                return 2;

            case 3:
                System.out.println("3: Wednesday is not a working day");
                return 3;

            case 4:
                System.out.println("4: Thursday is a working day");
                return 4;

            case 5:
                System.out.println("5: Friday is not a working day");
                return 5;

            case 6:
                System.out.println("6: Saturday is not a working day");
                return 6;

            case 7:
                System.out.println("5: Sunday is not a working day");
                return 7;

            default:
                System.out.println("out of range");
                return 0;

        }

    }

    public static void main(String[] args) {

        workingDays(3);
        System.out.println(workingDays(3));
    }

}

