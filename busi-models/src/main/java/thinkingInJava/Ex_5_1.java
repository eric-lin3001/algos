package thinkingInJava;

// 题目描述：创建一个类，它包含一个未初始化的String引用。验证该引用被Java初始化成了null。

class MyClass {
    String a;
    Integer b;
}

public class Ex_5_1 {
    public static void main(String[] args) {
        MyClass e = new MyClass();
        System.out.println("obj.a = " + e.a);
        System.out.println("obj.b = " + e.b);
    }
}

