package com.bahar;

public class Switch {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6};
        int a = numbers[3];
        switch (a){

            case 1:
                System.out.println("the number of index 0 is :" + numbers[0]);
                break;
            case 2:
                System.out.println("the number of index 1 is :" + numbers[1]);
                break;
            case 3:
                System.out.println("the number of index 2 is :" + numbers[2]);
                break;
            case 4:
                System.out.println("the number of index 3 is :" + numbers[3]);
                break;
            case 5:
                System.out.println("the number of index 4 is :" + numbers[4]);
                break;
            case 6:
                System.out.println("the number of index 5 is :" + numbers[5]);
                break;
            default:
                System.out.println("the index is not found");
                break;

        }


        String[] season = {"spring" , "summer" , "autumn" , "winter"};
        String b = season[1];
        switch (b){

            case "spring" :
                System.out.println("the first season is: " + season[0]);
                break;

            case "summer" :
                System.out.println("the second season is: " + season[1]);
                break;

            case "autumn" :
                System.out.println("the third season is: " + season[2]);
                break;

            case "winter" :
                System.out.println("fourth" + season[3]);
                break;

            default:
                System.out.println("no season is found");


        }

    }
}
