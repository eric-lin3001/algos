package thinkingInJava;

/**
 * Add an overloaded constructor to the previous exercise that takes a String argument
 * and prints it along with your message.
 *
 * Chapter 05 Exercise 04
 */

public class Ex_5_4 {
    public Ex_5_4() {
        System.out.println("xx");
    }

    public Ex_5_4(String arg) {
        System.out.println("xx "+arg);
    }

    public static void main(String[] args) {
        Ex_5_4 e = new Ex_5_4("yy");
    }
}
