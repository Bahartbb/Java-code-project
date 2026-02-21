package com.bahar;


//

public class ArrayReadAndaWriteJava
{

    //khoroojiye method int hast vali voroodi array hast
    //mige dar nahayat bayad yek adad bagrade (int),
    //mage jame khoonehaye arraye be ma adad nemide? pas kafie 2 ta khoone ro baham jam koni

    public static int addElementsOfArray(int[] numbers){   //voroodi array numbers ro migire ke jensesh int hast

        return numbers[0] + numbers[1];
    }

    //avalesh mige return null, chon meghdare pishfarze array (objectha) null hast
    //khorooji yek int[] barmigardoone, voroodish adad migire
    public static int[] neighbourNumbers(int number){

        return new int[] {number - 1 , number + 1};
    }


    public static void main(String[] args) {

        //1-
        //aval az hame bayad ye array tarif konim ke 2 meghdar dashte bashim, ke betoonim 2ta methode bala ro test konim
        //avali array migire va adad chap mikone:

        int zahlenArray[] = new int[]{2, 4};
        System.out.println("Summe der Arrayelemente: "
                + addElementsOfArray(zahlenArray));

        //2- ye adad tarif konim, bad ye moteghayer az jense array ijad konim
        //ke betoonim methode 2vom ro behehs pass bedim


        int zahl = 3;
        int ergebnisArray[] = neighbourNumbers(zahl);
        System.out.println("Kleiner Nachbar der Zahl " + zahl +
                ": " + ergebnisArray[0] +
                "\nGro�er Nachbar der Zahl " + zahl +
                ": " + ergebnisArray[1]);



    }


}
