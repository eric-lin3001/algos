package stack;

import java.util.NoSuchElementException;

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

    public boolean isEmpty(){
        return  first.item  == null;
    }

    public String peek(){
        if(isEmpty()){
            throw new NoSuchElementException("The stack is empty!");
        }
        return first.item;
    }


}
