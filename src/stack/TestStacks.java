package stack;

import java.util.Stack;

public class TestStacks {


    /**
     * 1. n/2 ceiling down
     * 
     * **/
    public static void ex_1_3_5(int n){
        Stack<Integer> s = new Stack<Integer>();
        while (n > 0) {
            s.push(n % 2);
            n = n / 2;
        }
        while (!s.isEmpty())
            System.out.print(s.pop());
        System.out.println();
    }

    public static void main(String[] args) {
        ex_1_3_5(50);
    }
}
