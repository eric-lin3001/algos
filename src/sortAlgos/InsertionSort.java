package sortAlgos;

public class InsertionSort {

    public void sort(int[] param) {

        for (int i = 0; i < param.length; i++) {
            for (int j = i; j > 0 ; j--) {
                if(less(param[j], param[j - 1])){
                    exchange(param, j, j-1);
                }
            }
        }

    }

    private boolean less(Comparable v,Comparable w) {
        return v.compareTo(w)<0;
    }

    private void exchange(int[] param, int a, int b) {
        int temp = param[a];
        param[a] = param[b];
        param[b] = temp;
    }

    public static void main(String[] args) {
        int[] testArray = new int[7];
        testArray[0] = 7;
        testArray[1] = 10;
        testArray[2] = 5;
        testArray[3] = 3;
        testArray[4] = 8;
        testArray[5] = 4;
        testArray[6] = 2;

        InsertionSort s = new InsertionSort();
        s.sort(testArray);
        System.out.println(1);
    }
}
