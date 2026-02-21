package com.bahar;

import java.util.Arrays;

public class Sortieren {

    public int[] sort(int[] toSort) {

        int[] kopie = Arrays.copyOf(toSort, toSort.length);
        Arrays.sort(kopie);
        return kopie;
    }

    public static void main(String[] args) {

        Sortieren sorting = new Sortieren();
        int[] toSort = new int[]{10, 7, 12, 4, 14};
        int[] toSort2 = new int[]{87, 56, 100, 10, 2, 16};
        int[] result = sorting.sort(toSort);
        int[] result2 = sorting.sort(toSort2);


        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(result2));
    }
}
