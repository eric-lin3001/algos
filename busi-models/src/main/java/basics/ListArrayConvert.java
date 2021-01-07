package basics;

import java.util.*;

public class ListArrayConvert {
    private static List<String> array2List(String[] s){

//        List<String> aList = new ArrayList<String>(Arrays.asList(s));
//        return aList;
        return Arrays.asList(s);
    };

    private static String[] list2Array(List<String> l){
        String[] s = l.toArray(new String[l.size()]);
        return s;
    }



    public static void main(String[] args) {
        String[] stuff = new String[]{"a","l","p","h","a","b","e","t"};

        List<String> list = array2List(stuff);
        String[] array = list2Array(list);
        Collections.sort(list,Collections.<String>reverseOrder());
        System.out.printf("%s\n",list);

        Integer[] stuff2 = new Integer[]{1,2,3,4};
        List<Integer> l2= Arrays.asList(stuff2);
        Collections.sort(l2,Collections.reverseOrder());
        System.out.printf("%s\n",l2);
    }
}
