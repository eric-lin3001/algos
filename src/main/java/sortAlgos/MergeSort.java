package sortAlgos;

public class MergeSort {
    private static void merge(int[] a, int lo, int mid, int hi) {
        int i = lo, j = mid+1;

        for (int k = lo; k <= hi; k++){
            aux[k] = a[k];
        }

        for (int k = lo; k <= hi; k++){
            // Merge back to a[lo..hi].
            if (i > mid) {
                a[k] = aux[j++];
            } else if (j > hi ){
                a[k] = aux[i++];
            } else if (aux[j] < aux[i]) {
                a[k] = aux[j++];
            } else {
                a[k] = aux[i++];
            }
        }
    }

    private static int[] aux;

    public static void sort(int[] a) {
        aux = new int[a.length]; // Allocate space just once.
        sort(a, 0, a.length - 1);
    }

    private static void sort(int[] a, int lo, int hi) {
        if (lo<hi) {
            int mid = lo + (hi - lo) / 2;
            sort(a, lo, mid);
            System.out.println("blablabla");
            sort(a, mid + 1, hi);
            merge(a, lo, mid, hi);
        }else {
            return;
        }

    }

    public static void main(String[] args) {
        int[] ori = {8,6,12,10};
        sort(ori);
    }
}
