package com.bahar;

//حلقهی whileزمانی استفاده میشود که تعداد تکرارها از قبل مشخص نیست و میخواهیم تا زمانی که یک شرط برقرار است،
//دستورات تکرار شوند.

// while(condition)

//soal: ta zamani ke i kamtar az 5 hast in shart bargharar bashe yani halghe ejra beshe
//soal: az adade 10 ta 1 be soorate makoos shomaresh beshe

public class Basic_While
{
    public static void main( String[] args )
    {

        int i = 0;   //khode 0 ro dar nazar nemigire
        while(i <= 4){   // < 5
            i++;
            System.out.println("i : " + i);
        }

    //_________________________________________________________

        int j = 11;
        while(j >= 2){
            j--;
            System.out.println("j :" + j);
        }


    }
}
