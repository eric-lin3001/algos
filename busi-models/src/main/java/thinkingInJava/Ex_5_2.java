package thinkingInJava;

// 创建一个类，它包含一个在定义时就被初始化了的String域，以及另一个通过构造器初始化的String域。这两种方式有何差异。

class MyClass2{
    String a = "a";
    String b;

    public MyClass2() {
        this.b = "b";
    }
}

public class Ex_5_2 {
    public static void main(String[] args) {
        MyClass2 myClass2 = new MyClass2();
        System.out.println("obj.a=" + myClass2.a);
        System.out.println("obj.b=" + myClass2.b);

    }

}
