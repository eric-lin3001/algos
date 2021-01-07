package basics;

import java.util.*;

public class CollectionMethods {

    public static void main(String[] args) {
//        List<Integer> list1 = new ArrayList<Integer>();
//        list1.add(1);
//        list1.add(2);
//
//        Iterator<Integer> it = list1.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
//
//
//        List<String> list2 = new ArrayList<String>();
//        String[] a = new String[]{"1","2","3","1","1"};
//        // add all elements from array a to list2
//        Collections.addAll(list2,a);
//        Arrays.asList(a);
//        System.out.println(Collections.frequency(list2,"1"));


        List<Integer> list = Arrays.asList(new Integer[]{2, 3,5,7});
        int factor = 2;
        list.forEach(x -> System.out.println(x+2));

    }
}
