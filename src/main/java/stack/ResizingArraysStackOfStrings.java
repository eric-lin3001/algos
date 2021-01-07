package stack;

public class ResizingArraysStackOfStrings {

    // instance variable
    private String[] s;
    private int N = 0;

    public ResizingArraysStackOfStrings(){
        s = new String[1];
    }

    public void push(String strToAdd){
        // 1. use N to index into the array
        // 2. put strToAdd to the place
        // 3. increment N
        if(isFull()){
            resize(2*s.length);
        }

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

    public void resize(int capacity) {
        String[] copy = new String[capacity];
        for(int i=0;i<s.length;i++){
            copy[i] = s[i];
        }
        s = copy;
    }

    public static void main(String[] args) {
        ResizingArraysStackOfStrings s = new ResizingArraysStackOfStrings();
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
        s.push("b");
        s.push("c");
        s.push("b");
        s.push("c");


        int a = 0;
    }
}
