package exercises.chapter1;

import stack.LinkedStackOfItems;

public class Ex1_3_19 {
    /**
     * Give a code fragment that removes the last node in a linked list whose
     * first node is first
     **/

    public Node first;
    public int size;

    public class Node {
        String item;
        Node next;
    }

    public void delLastNode() {
        Node current =first;
       for(int i=0;i<size-2;i++){
            current = current.next;
        }
        current.next = null;
    }

    public void push(String strToAdd) {
        Node nodeOld = first;
        first = new Node();
        first.item = strToAdd;
        first.next = nodeOld;
        size++;
    }


    public String pop() {
        String toReturn = first.item;
        first = first.next;
        size--;
        return toReturn;
    }





    public static void main(String[] args) {
        Ex1_3_19 e = new Ex1_3_19();
        e.push("1");
        e.push("2");
        e.push("3");
        e.delLastNode();
        System.out.println(1);

    }

}
