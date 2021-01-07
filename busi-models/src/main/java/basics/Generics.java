package basics;

import java.util.Comparator;

public class Generics {

    public static void main(String[] args) {
        String[] s = new String[]{"a"};
        int[] i = new int[]{1};
        char[] c = new char[]{'c'};
        printGeneric(s);

        System.out.println(findMax(1,2));
        System.out.println(findMax("zz","z"));

    }

    // only T(generic types) can be used in this method
    private static <T> void printGeneric(T[] array){
        for(T t:array){
            System.out.println(t);
        }
    }


    // only object that inherits from the Comparable class can be used in this method.
    public static <T extends Comparable<T>> T findMax(T a,T b){
        T m = a;
        if(b.compareTo(a)>0){
            m = b;
        }
        return m;
    }
}
