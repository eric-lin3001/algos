package basics;

import java.util.ArrayList;
import java.util.List;



// IMyList extends IMyCollection, IMyCollection extends Iterable
// 在MyList实现类中，既要实现IMyList中定义的方法，也要实现IMyList继承的所有父类的方法。
public class MyList<E> implements IMyList<E> {

    public void printWhere(){
        System.out.println("From Son Class");
        printWhere();
    }

    public static void main(String[] args) {
        MyList m = new MyList();
        m.printWhere();
        List<Integer> a = new ArrayList<Integer>();

    }

    // implement method from IMyList
    public void add() {

    }

    public int size() {
        return 0;
    }

    public IMyIterator<E> iterator() {
        return new MyItr();
    }

    private class MyItr implements IMyIterator<E>{
        public boolean hasNext() {
            return false;
        }
    }
}
