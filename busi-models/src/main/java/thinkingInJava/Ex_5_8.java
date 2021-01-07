package thinkingInJava;


/**
 * Create a class with two methods. Within the first method, call the second method twice:
 * the first time without using this, and the second time using this - just to see it working;
 * you should not use this form in practice.
 * <p>
 * Chapter 05 Exercise 08
 */

public class Ex_5_8 {
    void peel() {
        getBananaSize();
        this.getBananaSize();
    }

    int getBananaSize() {
        return 1;
    }
}
