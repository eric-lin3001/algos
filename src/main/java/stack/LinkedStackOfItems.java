package stack;

import java.util.Stack;

public class LinkedStackOfItems<Item> {

    private Node first;

    private class Node{
        Item item;
        Node next;
    }

    public void push(Item strToAdd){
        Node nodeOld = first;
        first = new Node();
        first.item = strToAdd;
        first.next = nodeOld;
    }


    public Item pop(){
        Item toReturn = first.item;
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


    public void main(String[] args) {
//        LinkedStackOfItems<String> s = new LinkedStackOfItems<String>();
//        s.push("a");
//        s.push("b");
//        s.push("c");
//
//        Node firstOld = s.first;
//
//        Node x = s.first;
//        x.next = null;
//
//        Node firstNew = s.first;
//        System.out.println(1);

    }
}
