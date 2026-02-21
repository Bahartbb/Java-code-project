package com.bahar;

public class toBin {

    public static char holeZeichenAnPosition(String input, int position){

        if(position < 0 || input == null || input.length() < position){
            throw new IllegalArgumentException("invalid position");
        } else {
            return input.charAt(position);
        }
    }


    public static String ersetzeMitte(String input, char trenner){

        String parts[];
        parts = input.split(String.valueOf(trenner));
        if(parts.length < 3){
            return input;
        } else {
            String middle;
            middle = parts[1].replace("a", "X");
            return parts[0] + middle + parts[2];
        }


    }


    public static int millionaer(double startkapital, double zinssatz){

        int Jahr = 0;
        double rate = zinssatz/100;
        while (startkapital < 1_000_000){
            startkapital += rate * startkapital;
            Jahr++;
        }
        return Jahr;
    }



    public static void main(String[] args) {
        System.out.println(holeZeichenAnPosition("bahar", 0));

        System.out.println(ersetzeMitte("yaaaaaaaay:axaxaxaxa:yaaaaaaay" , ':'));
        System.out.println(ersetzeMitte("bahar;bahar;bahar" , ';'));

        System.out.println(millionaer(500_000, 23));
    }
}
