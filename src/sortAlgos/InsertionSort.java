package sortAlgos;

import java.util.ArrayList;
import java.util.List;

public class InsertionSort {

    private static boolean less(Comparable v, Comparable w) { return v.compareTo(w) < 0; }

    private static void exch(int[] a, int i, int j) {
        int t = a[i]; a[i] = a[j]; a[j] = t; }


    public void sort(int[] a) { // Sort a[] into increasing order.

        int N = a.length;

        for (int i = 1; i < N; i++)

        { // Insert a[i] among a[i-1], a[i-2], a[i-3]... ..

            for (int j = i; j > 0 && less(a[j], a[j-1]); j--)
                exch(a, j, j-1);
        } }


    public static void main(String[] args) {
        int[] a = new int[5];
        a[0] = 3;
        a[1] = 4;
        a[2] = 50;
        a[3] = 7;

        InsertionSort i = new InsertionSort();
        i.sort(a);
    }
}
