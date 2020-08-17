package queue;

import stack.LinkedStackOfStrings;

public class LinkedQueueOfStrings {
    private Node first;
    private Node last;

    private class Node{
        String item;
        Node next;
    }

    public boolean isEmpty(){
        return first == null;
    }

    // push: to the end
    public void enqueue(String item){
        Node oriLast  = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if(isEmpty()){
            first = last;
        }else {
            oriLast.next =last;

        }
    }


    // pop: pop from the beginning（first in, first out）
    public String dequeue(){
        String rst = first.item;
        first = first.next;
        if(isEmpty()){
            last = null;
        }
        return rst;
    }

    public static void main(String[] args) {
        LinkedQueueOfStrings q = new LinkedQueueOfStrings();
        q.enqueue("a");
        q.enqueue("b");
        q.enqueue("c");
        q.dequeue();

        System.out.println(1);
    }
}
