package sortAlgos;

import java.util.ArrayList;
import java.util.List;


public class InsertionSort {

    private static boolean less(Comparable v, Comparable w) { return v.compareTo(w) < 0; }

    private static void exch(int[] a, int i, int j) {
        int t = a[i]; a[i] = a[j]; a[j] = t; }


    public void sort(int[] a) { // Sort a[] into increasing order.

        int N = a.length;

        for (int i = 1; i < N; i++) {


            for (int j = i; j > 0; j--) {
                if (less(a[j], a[j - 1])) {
                    exch(a, j, j - 1);
                }
            }
        }
    }

    public void sort2(int[] a){
        for(int i=1;i<a.length;i++){
            int key = a[i];
            int j = i-1;
            while (j>=0 && a[j]>key){
                a[j+1] = a[j];
                j = j -1;
            }
            a[j+1] = key;
        }
    }


    public static void main(String[] args) {
        int[] a = new int[4];
        a[0] = 3;
        a[1] = 4;
        a[2] = 2;
        a[3] = 7;

        InsertionSort i = new InsertionSort();
//        i.sort(a);
        i.sort2(a);
        System.out.println(1);
    }
}
