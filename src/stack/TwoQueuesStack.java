package stack;

import queue.TwoStacksQueue;

import java.util.LinkedList;
import java.util.Queue;

public class TwoQueuesStack {

    TwoStacksQueue q1 = new TwoStacksQueue();
    TwoStacksQueue q2 = new TwoStacksQueue();

    public void push(String str){
        q1.enqueue(str);
    }

    public String pop(){
        while (q1.sizeOfQueue()>1){
            q2.enqueue(q1.dequeue());
        }
        String rst = q1.dequeue();
        q1 = q2;
        q2 = new TwoStacksQueue();
        return rst;
    }

    public static void main(String[] args) {
        TwoQueuesStack s = new TwoQueuesStack();
        s.push("3");
        s.push("4");
        System.out.println(s.pop());
        s.push("5");
        System.out.println(s.pop());
        System.out.println(s.pop());
        s.push("4");
        System.out.println(s.pop());


    }
}
