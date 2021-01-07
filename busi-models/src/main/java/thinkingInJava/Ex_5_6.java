package thinkingInJava;

/**
 Modify the previous exercise so that two of the overloaded methods have two arguments
 (of two different types), but in reversed order relative to each other. Verify that this works.

 Chapter 05 Exercise 06
 */

class Dog1 {
    public void bark() {
        System.out.println("Origin Bark");
    }

    public void bark(int i,char s) {
        System.out.println("int first:  " + i + ",char second: "+ s);
    }

    public void bark(char s, int i) {
        System.out.println("char first " + s + ",int second: "+ i);
    }

    public void bark(float f) {
        System.out.println("float Bark " + f);
    }

    public void bark(double d) {
        System.out.println("double Bark " + d);
    }

    public void bark(byte b) {
        System.out.println("byte Bark " + b);
    }

    public void bark(long l) {
        System.out.println("long Bark " + l);
    }

    public void bark(short s) {
        System.out.println("short Bark " + s);
    }
}

public class Ex_5_6 {
    public static void main(String[] args) {
        Dog1 d = new Dog1();
        byte b = 0;
        char c = 'x';
        short s = 0;
        // byte
        d.bark(b);
        // char
        d.bark(c,1);
        // float
        d.bark(1f);
        // double
        d.bark(1.0);
        // int
        d.bark(1,c);
        // long
        d.bark(1L);
        // short
        d.bark(s);
    }
}
