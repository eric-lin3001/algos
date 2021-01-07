package basics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class MyCollection {
    int a = 1;
    private int b = 1;
    public void printWhere(){
        System.out.println("From Father Class");
    }




    /** Collection compare
     */
    // 1. int 倒序
    public static void sortIntReverse(Integer[] a1){
        Arrays.sort(a1,new Comparator<Integer>(){
            @Override
            public int compare(Integer o1,Integer o2){
                return o2-o1;
            }
        });
    }

    public static void main(String[] args) {
        Integer[] a1 = new Integer[]{4,2,7};
        sortIntReverse(a1);
        for(int i=0;i<a1.length;i++){
            System.out.println(a1[i]);
        }
    }
}