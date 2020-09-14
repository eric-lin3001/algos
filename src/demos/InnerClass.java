package demos;

public class InnerClass {

    public Node item;

    public class Node {
        String value;
        Node next;
    }

    public void test() {
        item = new Node();
        Node help = new Node();
        help.value = "100";
        item.value = "3";
        item.next = help;
        Node current = item;
        current = current.next;
        current.value = "4";
        System.out.println(1);

    }

    public static void main(String[] args) {
        InnerClass innerClass = new InnerClass();
        innerClass.test();
    }
}
