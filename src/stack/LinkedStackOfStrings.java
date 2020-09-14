package stack;

import java.util.Stack;

public class LinkedStackOfStrings {
    public Node first = null;
    private class Node{
        String item;
        Node next;
    }

    public void push(String strToAdd){
        Node nodeOld = first;
        first = new Node();
        first.item = strToAdd;
        first.next = nodeOld;
    }

    public String pop(){
        String toReturn = first.item;
        first = first.next;
        return toReturn;
    }


    public Node delLast(){
        Node x = first;
        while (x.next.next != null){
            x = x.next;  // reassign x, not first
        }
        x.next = null; // reassign x & first
        return first;
    }
    public static void main(String[] args) {
        LinkedStackOfStrings s = new LinkedStackOfStrings();
        s.push("a");
        s.push("b");
        s.push("c");


        Node firstOld = s.first;

        Node x = s.first;
        x.next = null;

        Node firstNew = s.first;
        System.out.println(1);

    }
}
