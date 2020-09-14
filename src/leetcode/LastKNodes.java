package leetcode;

import stack.LinkedStackOfStrings;

public class LastKNodes {


    public Node first = null;

    private static class Node{
        String item;
        Node next;
    }


    public int getSize(Node n){
        int N =1;
        while (n.next!=null){
            n = n.next;
            N++;
        }
        return N;
    }


    public Node getKthFromEnd(Node n, int k) {
        int sizeOfn = getSize(n);
        int idx = sizeOfn-k;
        int f = 0;
        while (idx!=f){
            n = n.next;
            f++;
        }
        return n;
    }

    public static void main(String[] args) {
        Node n = new Node();
        Node n1 = new Node();
        n1.item = "2";
        n.next = n1;
        Node n2 = new Node();
        n2.item = "3";
        n1.next = n2;
        LastKNodes l = new LastKNodes();
        Node rst = l.getKthFromEnd(n,2);
        System.out.println(1);
    }
}
