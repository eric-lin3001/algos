package basics;


public class NestedClass {
    int a;

    class B{
        public void p(){
            System.out.println(a);
        }
    }

    static class C{
        public void p(){
            NestedClass n = new NestedClass();
            System.out.println(n.a);
        }
    }
}
