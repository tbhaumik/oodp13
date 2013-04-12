package lists;

// This interface describes all of the methods that a list should have.
// This interface extends Iterable so that lists can be used in a for-each loop.

import java.util.Iterator;

public interface List<E> extends Iterable<E> {
    public void add(E value);

    public void add(int index, E value);

    public boolean contains(E value);

    public E get(int index);

    public int indexOf(E value);

    public boolean isEmpty();

    @Override
    public Iterator<E> iterator();

    public void remove(int index);

    public void set(int index, E value);

    public int size();
}