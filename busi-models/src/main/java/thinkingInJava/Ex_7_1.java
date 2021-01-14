package thinkingInJava;

/**
 * Create a simple class. Inside a second class, define a reference to an object
 * of the first class. Use lazy initialization to instantiate this object.
 * <p>
 * Chapter 07 Exercise 01
 */

class ClassA {
    public ClassA() {
        System.out.println("this is ClassA coustructor!");
    }

    @Override
    public String toString() {
        return "ClassA";
    }
}

public class Ex_7_1 {
    ClassA a;

    @Override
    public String toString() {
//        if (a == null) {
//            a = new ClassA();
//        }
        String s = "Class Ex_7_1";
        return a + s;
    }

    public String toString2() {
        if (a == null) {
            a = new ClassA();
        }
        String s = "Class Ex_7_1";
        return a + s;
    }

    public static void main(String[] args) {
        Ex_7_1 ex_7_1 = new Ex_7_1();
        System.out.println(ex_7_1);
        ex_7_1.toString2();
    }
}
