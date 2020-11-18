package basics;

import java.util.Iterator;

public interface IMyIterable<T> {
    /**
     * Returns an iterator over elements of type {@code T}.
     *
     * @return an Iterator.
     */
    IMyIterator<T> iterator();
}