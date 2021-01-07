package thinkingInJava;

/**
 * Create a class called Dog with an overloaded bark( ) method. This method should be
 * overloaded based on various primitive data types, and print
 * different types of barking, howling, etc., depending on which overloaded version is called.
 * Write a main( ) that calls all the different versions.
 * <p>
 * Chapter 05 Exercise 05
 */

class Dog {
    public void bark() {
        System.out.println("Origin Bark");
    }

    public void bark(int i) {
        System.out.println("int Bark " + i);
    }

    public void bark(char s) {
        System.out.println("char Bark " + s);
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

public class Ex_5_5 {
    public static void main(String[] args) {
        Dog d = new Dog();
        byte b = 0;
        char c = 'x';
        short s = 0;
        // byte
        d.bark(b);
        // char
        d.bark(c);
        // float
        d.bark(1f);
        // double
        d.bark(1.0);
        // int
        d.bark(1);
        // long
        d.bark(1L);
        // short
        d.bark(s);
    }
}
