package demos;//package demos;

import java.util.Arrays;
import java.util.Comparator;

public class MyComparator {

    public static void main(String[] args) {
        int[][] m = new int[][]{{3},{2},{1}};
        Arrays.sort(m,new Comparator<int[]>(){
            @Override
            public int compare(int[] point1, int[] point2) {
                return point1[0]-point2[0];
            }
        });
        System.out.println(1);
    }


}
