package basics;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class MyLinkedList {
    private static void printMe(List<Integer> l){
        for(Integer i:l){
            System.out.printf("%s",i);
        }
        System.out.println();
    }

    private static void remove(List<Integer> l, Integer from, Integer to){
        l.subList(from,to).clear();
    }

    private static void reverseMe(List<Integer> l){
        ListIterator<Integer> it = l.listIterator(l.size());
        while (it.hasPrevious()){
            System.out.println(it.previous());
        }
    }

    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(1);
        linkedList.add(2);
        printMe(linkedList);
//        remove(linkedList,0,1);
//        printMe(linkedList);
        reverseMe(linkedList);


    }
}
