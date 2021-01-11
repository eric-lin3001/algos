package thinkingInJava.demos;

import java.util.Arrays;
import java.util.List;

public class Demo {

    int i;
    List<Integer> l;

    void t() {
        int i;
    }

    public static void main(String[] args) {

        Demo d = new Demo();
        System.out.println(d.l);
        System.out.println(d.i);
        System.out.println(d.i + 1);

        int[] a = new int[]{3,2,4};
        System.out.println(Arrays.toString(a));
    }
}
