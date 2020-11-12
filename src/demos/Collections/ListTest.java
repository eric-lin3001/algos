package demos.Collections;

import com.sun.tools.javac.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> list = List.of("A", "B", "C","C");
        System.out.println(list.lastIndexOf("C"));
    }
}
