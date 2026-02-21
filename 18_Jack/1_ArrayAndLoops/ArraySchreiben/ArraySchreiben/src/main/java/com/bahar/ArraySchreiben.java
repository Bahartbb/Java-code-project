package com.bahar;

/* In dieser Aufgabe geht es darum, ein Array zu erstellen und mit Zahlen zu belegen. Dies soll
als Einstieg in das Thema Arrays helfen.
In der main-Methode wurden bereits einige Testfälle erstellt, womit Sie ihre Ergebnisse testen
können. Natürlich können Sie sich auch eigene Testfälle erstellen.

Aufgabe 1 createArray
Die Methode createArray soll ein int [] Array der Länge laenge erzeugen, bei dem
an jeder Stelle der Index steht. So soll also gelten:
array[0]=0, array[1]=1, ... , array[laenge-1]=laenge-1
Dazu muss man das Array mit einer Schleife durchlaufen und in jedem
Schleifendurchlauf den Index an die gegebene Stelle schreiben, allgemein also
array[index] = index.
 */


import java.util.Arrays;

public class ArraySchreiben
{
    public static int[] createArray(int laenge){

        //hadafe aval ijade yek array:
        //bad inke laenge ro be onvane array length behesh bedim
        //bad ye loop besazim ke bege kolle halghe ro yani ta laenge pish bere
        //va dar har index shomare khode index ro gharar bede

        int[] array = new int[laenge];
        for (int index = 0 ; index < laenge ; index++){
            array[index] = index;
        }

        return array;
    }


    public static void main( String[] args )
    {
        System.out.println("Hier sollte '[0]' stehen. Bei Ihnen steht: " + Arrays.toString(createArray(1)));
        System.out.println("Hier sollte '[0, 1]' stehen. Bei Ihnen steht: " + Arrays.toString(createArray(2)));
        System.out.println("Hier sollte '[0 , 1, 2]' stehen. Bei Ihnen steht: " + Arrays.toString(createArray(3)));
        System.out.println("Hier sollte '[0 , 1, 2 , 3]' stehen. Bei Ihnen steht: " + Arrays.toString(createArray(4)));
        System.out.println("Hier sollte '[0 , 1 , 2 , 3 , 4]' stehen. Bei Ihnen steht: " + Arrays.toString(createArray(5)));
    }
}
