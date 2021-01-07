package demos.Trees;


public class D {
    int a;
    String b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public static void main(String[] args) {
        D d = new D();
        System.out.println(d.getA());
        System.out.println(d.getB());
    }
}
