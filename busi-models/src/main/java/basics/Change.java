package basics;

import java.util.ArrayList;
import java.util.HashSet;

public class Change {


    private int a;
    private final int b = 0;
    private String c;

    public void ss(){
        HashSet hs = new HashSet();
        HashSet hs1 = new HashSet();
        hs.add(1);
        hs.add(1);
    }

    public static void main(String[] args) {
//        Change change = new Change();
//        change.ss();

        HashSet hs = new HashSet();
        HashSet hs1 = new HashSet();
        System.out.println(hs==hs1);
        System.out.println(hs.equals(hs1));
        System.out.println(hs.hashCode());
        System.out.println(hs1.hashCode());

    }

}
