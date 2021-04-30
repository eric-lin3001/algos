package basics.generics;

public class MainClass {
    public static void main(String[] args) {
        Integer[] ints = new Integer[]{1,2};
        Character[] chars = new Character[]{'a','b'};
        printMe(ints);
        printMe(chars);

        System.out.println(max(1,2,1));
    }

    /**
     * Example 1
     * @param array
     * @param <T>
     */
//    public void printMe(int[] a){
//        for(int i:a){
//            System.out.println(i);
//        }
//    }

//    void printMe(char[] a){
//        for(char i:a){
//            System.out.println(i);
//        }
//    }

    static <T> void printMe(T[] array){
        for(T i:array){
            System.out.printf("%s ",i);
        }
        System.out.println();
    }

    /**
     * Example 2
     * @param <T>
     * @param <T>
     */

    static <T extends Comparable<T>> T max(T a,T b,T c){
        T tempMax = a;
        if(b.compareTo(tempMax)>0){
            tempMax = b;
        }
        if(c.compareTo(tempMax)>0){
            tempMax = c;
        }

        return tempMax;
    }
}
