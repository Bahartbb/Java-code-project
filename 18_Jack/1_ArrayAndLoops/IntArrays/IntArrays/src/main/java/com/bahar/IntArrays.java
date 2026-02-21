package com.bahar;

/*
In dieser Übungsaufgabe werden Sie verschiedene Berechnungen mit Zahlen aus einem
Array durchführen. Konkret sollen Sie Methoden implementieren, welche den Durchschnitt
und den Median der Zahlen eines Arrays berechnen.
In der main-Methode stehen Ihnen bereits einige Testfälle zur Verfügung. Natürlich
können Sie sich auch eigene Testfälle erstellen.

 Aufgabe 1 average
Die Methode average soll den Durchschnitt aus allen Zahlen im Array array berechnen
und zurückgeben. Der Durchschnitt ist mathematisch wie folgt, wobei n die Anzahl der
Werte im Array ist.
        (𝑎𝑟𝑟𝑎𝑦[0] + 𝑎𝑟𝑟𝑎𝑦[1]+ . . . +𝑎𝑟𝑟𝑎𝑦[n − 2] + 𝑎𝑟𝑟𝑎𝑦[n − 1]) / 𝑛

 */
public class IntArrays
{

    public static double average(int[] array){

        if (array == null || array.length == 0){
            return 0;
        }

        double sum = 0;
        for(int number : array){
            sum += number;
        }

        return sum/array.length;
    }

    /*
  Aufgabe 2 median
Die Methode median soll den Median aus einem Array berechnen und zurückgeben.
Der Median ist diejenige Zahl, die in einem sortierten Array in der Mitte steht.
Hat das Array eine gerade Anzahl von Elementen, ist es der Durchschnitt von beiden
Zahlen, die in der Mitte stehen.
(Hinweis: Der Datentyp int kann keine Dezimalzahlen darstellen.)
Sie können bei der Bearbeitung dieser Aufgabe davon ausgehen, dass das Array bereits
sortiert ist.
    */

    //result double bargardoone va vaoroodi ham ye yek array bashe
    //baraye median array bayad sort shode bashe ( keinja hast)
    //age tedade adad fard bud, median mishe adade vasta
    //age tedade adad zoj bud, median mishe average 2ta adade miyani (2ta dadai ke dar vasat gharar gereftan)
    //yani dar halate zoj budan, yek baryad baraye 2ta adade vast amale average ham hesab koni

    public static double Median(int[] array){

        if(array == null || array.length == 0){
            return 0;
        }

        int length = array.length;
        for(int i=0 ; i < length ; i++){
            if (length % 2 == 1){
                return array[length/2]; //return kon un khoone az array ke mishe khooneye vasat
            } else {
                return (array[(length/2)-1] + array[length/2])/2.0;
                // (khooneye vasat menhaye 1 + khooneye vast), taghsim bar 2
            }

        }

        return 0;
    }




    public static void main( String[] args )
    {
        int[] test = {3, 4, 5, 9, 12, 16, 56};
        System.out.println("Beim Aufruf der Methode 'public static double durchschnitt(int[] array)' mit dem Parameter test sollte herauskommen:"
                + "\n 15"
                + "\n Bei dir kommt heraus:"
                + average(test));
        System.out.println("Beim Aufruf der Methode 'public static double median(int[] array)' mit dem Parameter test sollte herauskommen:"
                + "\n 9"
                + "\n Bei dir kommt heraus:"
                + Median(test));
    }
}
