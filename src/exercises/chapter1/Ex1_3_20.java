package exercises.chapter1;

public class Ex1_3_20 {

    /** Write a method delete() that takes an int argument k and deletes the kth element in a linked list,
     *  if it exists.
     */


    public Node first;
    public int size;

    public class Node {
        String item;
        Node next;
    }

    public void delete(int k) {
        Node afterK = first;
        if(k<size){
            for(int i =0;i<k+1;i++){
                afterK = afterK.next;
            }

            Node current = first;
            for(int i =0;i<k-1;i++){
                current = current.next;
            }
            current.next = afterK;
            size--;
        }else if(k==size){
            Node current =first;
            for(int i=0;i<size-2;i++){
                current = current.next;
            }
            current.next = null;
        }
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
        Ex1_3_20 e = new Ex1_3_20();
        e.push("1");
        e.push("2");
        e.push("3");
        e.push("4");
        e.push("5");
        e.delete(5);
        System.out.println(1);

    }
}
