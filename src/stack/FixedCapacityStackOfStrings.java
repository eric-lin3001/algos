package stack;

public class FixedCapacityStackOfStrings {

    // instance variable
    private String[] s;
    private int N = 0;

    public FixedCapacityStackOfStrings(int capacity) {
        s = new String[capacity];
    }

    public void push(String strToAdd){
        // 1. use N to index into the array
        // 2. put strToAdd to the place
        // 3. increment N
        s[N++] = strToAdd;
    }

    public String pop(){
        // 1. decrement N
        // 2. use the decremented N to index into array
        return s[--N];
    }

    public boolean isFull(){
        return N==s.length;
    }

    public static void main(String[] args) {
        FixedCapacityStackOfStrings s = new FixedCapacityStackOfStrings(6);
        s.push("a");
        s.push("b");
        s.push("c");
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.isFull());
        s.push("a");
        s.push("b");
        s.push("c");
        s.push("b");
        s.push("c");

        System.out.println(s.isFull());
        s.push("c");
        s.push("b");
        s.push("c");

        int a = 0;
    }
}
