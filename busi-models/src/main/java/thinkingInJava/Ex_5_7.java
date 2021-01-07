package thinkingInJava;

/**
 * Create a class without a constructor, and then create an object of that class in main()
 * to verify that the default constructor is automatically synthesized.
 *
 * Chapter 05 Exercise 07
 */

public class Ex_5_7 {
    void show(){
        System.out.println("Ex_5_7 Class, show() method");
    }

    public static void main(String[] args) {
        Ex_5_7 e = new Ex_5_7();
        e.show();
    }
}
