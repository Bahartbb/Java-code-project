package com.bahar;

public class Days {

    public static void main(String[] args) {

        Days_Enum today = Days_Enum.Sunday;

        if (today == Days_Enum.Saturday || today == Days_Enum.Sunday){
            System.out.println("it is weekend");
        } else {
            System.out.println("it is not weekend");
        }
    }
}
