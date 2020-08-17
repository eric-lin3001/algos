package queue;

import stack.LinkedStackOfItems;

import java.util.Stack;

public class TwoStacksQueue {
    private Stack<String> fstStack = new Stack<String>();
    private Stack<String> secStack = new Stack<String>();
    private int N;


    public void enqueue(String strToAdd){
        fstStack.push(strToAdd);
        N++;
    }

    public String dequeue(){
        if (secStack.isEmpty()){
            while (!fstStack.isEmpty()){
                secStack.push(fstStack.pop());
            }
        }
        String rst = secStack.pop();
        N--;
        return rst;
    }

    public int sizeOfQueue(){
        return N;
    }


    public static void main(String[] args) {
        TwoStacksQueue s = new TwoStacksQueue();
        s.enqueue("2");
        s.enqueue("3");
        System.out.println(s.dequeue());
    }

}
