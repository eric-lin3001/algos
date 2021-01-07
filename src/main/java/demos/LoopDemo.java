package demos;

import java.util.ArrayList;
import java.util.List;

public class LoopDemo {


    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(30);
        intList.add(40);
        intList.add(50);

        for(Integer it : intList){
            System.out.println(it);
        }
    }
}
