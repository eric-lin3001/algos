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
        int[] testArray = new int[2];
        testArray[0] = 10;
        testArray[1] = 7;

        SelectionSort s = new SelectionSort();
        s.sort(testArray);
        System.out.println(1);
    }
}
