package sortAlgos;

public class SelectionSort {
//    int[] s = null;
//
//    public SelectionSort() {
//        s = new int[10];
//    }

    public void sort(int[] param){

        for(int i=0;i<param.length;i++){
            int minKey = i;
            for(int j=i+1;j<param.length;j++){
                if(param[j]<param[minKey]){
                    minKey = j;
                }
            }
            exchange(param,minKey,i);
        }

    }


    private void exchange(int[] param,int a,int b){
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

        SelectionSort s = new SelectionSort();
        s.sort(testArray);
        System.out.println(1);
    }
}
