package basics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class MyIterator {

    static List<String> s = new ArrayList<String>();

    public void addS(Collection<String> c){
        s.add("1");
        s.add("b");
        s.add("c");
    }

    public static void main(String[] args) {
        MyIterator myIterator = new MyIterator();
        myIterator.addS(s);
        Iterator<String> it = s.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
