package queue;

import stack.LinkedStackOfItems;

import java.util.Stack;

public class TwoStacksQueue {
    private Stack<String> fstStack = new Stack<String>();
    private Stack<String> secStack = new Stack<String>();
    private int N;


    public TwoStacksQueue() {
        fstStack = new Stack<>();
        secStack = new Stack<>();
    }

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

    public String peek(){
        if(secStack.isEmpty()){
            while (!fstStack.isEmpty()){
                secStack.push(fstStack.pop());
            }
        }
        return secStack.peek();
    }

    public int sizeOfQueue(){
        return N;
    }


    public static void main(String[] args) {
        TwoStacksQueue s = new TwoStacksQueue();
        System.out.println(s.peek());
        s.enqueue("2");
        s.enqueue("3");
        System.out.println(s.dequeue());
    }

}
